const express = require('express');
const bodyParser = require('body-parser');
const SpotifyWebApi = require('spotify-web-api-node');
const app = express();
const port = 3000;

// Replace with your own client ID and secret
const spotifyApi = new SpotifyWebApi({
  clientId: '1244d987ccd24a9a98907a43761d0ac9',
  clientSecret: 'a52f5f30f92f4eab8bb28463ac6c9934',
});

app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: true }));

app.set('view engine', 'ejs');

app.get('/login', (req, res) => {
  const scopes = ['user-read-private', 'user-read-email', 'playlist-modify-public'];
  const redirectUri = 'http://localhost:3000/callback';
  const authorizeURL = spotifyApi.createAuthorizeURL(scopes, null, false, redirectUri);
  res.redirect(authorizeURL);
});

app.get('/callback', (req, res) => {
  const code = req.query.code;
  const redirectUri = 'http://localhost:3000/callback';
  spotifyApi.authorizationCodeGrant(code, redirectUri)
    .then(data => {
      spotifyApi.setAccessToken(data.body.access_token);
      spotifyApi.setRefreshToken(data.body.refresh_token);
      res.redirect('/');
    })
    .catch(err => {
      console.log('Error getting access token', err);
      res.status(500).send('Error getting access token');
    });
});

app.get('/', (req, res) => {
  res.render('index');
});

app.post('/search', (req, res) => {
  const query = req.body.query;
  const limit = 20;
  spotifyApi.searchTracks(query, { limit })
    .then(data => {
      const tracks = data.body.tracks.items;
      res.render('search', { tracks });
    })
    .catch(err => {
      console.log('Error searching tracks', err);
      res.status(500).send('Error searching tracks');
    });
});

app.post('/createPlaylist', (req, res) => {
  const name = req.body.name;
  const tracks = req.body.tracks;
  const options = { public: true };
  spotifyApi.createPlaylist(name, options)
    .then(data => {
      const playlistId = data.body.id;
      const trackIds = tracks.map(track => track.id);
      spotifyApi.addTracksToPlaylist(playlistId, trackIds)
        .then(() => {
          res.render('playlist', { name, tracks });
        })
        .catch(err => {
          console.log('Error adding tracks to playlist', err);
          res.status(500).send('Error adding tracks to playlist');
        });
    })
    .catch(err => {
      console.log('Error creating playlist', err);
      res.status(500).send('Error creating playlist');
    });
});

app.listen(port, () => {
  console.log(`App listening at http://localhost:${port}`);
});
