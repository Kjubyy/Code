import spotipy
from spotipy.oauth2 import SpotifyOAuth
from flask import Flask, request, render_template, send_from_directory

# Replace these values with your own
CLIENT_ID = '1244d987ccd24a9a98907a43761d0ac9'
CLIENT_SECRET = 'a52f5f30f92f4eab8bb28463ac6c9934'
REDIRECT_URI = 'http://localhost:3000/callback/'
SCOPE = 'playlist-modify-public'
USERNAME = 'lukaspp34'

# Authenticate the user's Spotify account
sp = spotipy.Spotify(auth_manager=SpotifyOAuth(client_id=CLIENT_ID,
                                               client_secret=CLIENT_SECRET,
                                               redirect_uri=REDIRECT_URI,
                                               scope=SCOPE,
                                               username=USERNAME))

app = Flask(__name__)

@app.route('/')
def home():
    return render_template('home.html')

@app.route('/search', methods=['POST'])
def search():
    search_term = request.form['search']
    results = sp.search(q=search_term, type='track', limit=20)
    tracks = results['tracks']['items']
    return render_template('results.html', tracks=tracks)


if __name__ == '__main__':
    app.run(debug=True)