import java.util.*;

public class KinoKarten {

    int film1 = 6;
    int film2 = 7;
    int mäsigung = 25;
    int logue = 1;
    String kateogire;
    String film;
    double temp;
    double ergebnis;
    int alter;

    public void eingabe() {

        Scanner sc = new Scanner(System.in);

        System.out.print("In welchen Film gehen Sie: ");
        film = sc.next();

        System.out.print("Welche Sitze haben Sie: ");
        kateogire = sc.next();

        System.out.print("Wie alt sind Sie: ");
        alter = sc.nextInt();

    }

    public void verarbeiten() {

        if (alter >= 60 && film.equals("Tenet") && kateogire.equals("Sperrsitze")) {
            temp = film1 / 100 * mäsigung;
            ergebnis = film1 - temp;
        } else if (alter < 60 && film.equals("Tenet") && kateogire.equals("Sperrsitze")) {
            ergebnis = film1;
        }

        if (alter >= 60 && film.equals("Der geheime Garten") && kateogire.equals("Sperrsitze")) {
            temp = film2 / 100 * mäsigung;
            ergebnis = film2 - temp;
        } else if (alter < 60 && film.equals("Der geheime Garten") && kateogire.equals("Sperrsitze")) {
            ergebnis = film2;
        }

        if (kateogire.equals("Logue") && film.equals("Tenet")) {
            ergebnis = film1 + logue;
        } else if (kateogire.equals("Logue") && film.equals("Der geheime Garten")) {
            ergebnis = film2 + logue;
        }
    }

    public void ausgabe() {

        System.out.print("Sie müssen " + ergebnis + " € brutto bezahlen");
        System.out.print("Sie sitzen in der " + kateogire);
    }

    public static void main(String[] args) {

        KinoKarten kk = new KinoKarten();

        kk.eingabe();
        kk.verarbeiten();
        kk.ausgabe();
    }

}
