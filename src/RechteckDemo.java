public class RechteckDemo {
    public static void main(String[] args) {
        int breite = 5;
        int laenge = 5;

umfang(5,5);
flaeche(5,5);
    }

    public static void umfang (int breite, int laenge) {
 int umfang = breite * 2 + laenge * 2;
        System.out.println("Der Umfang lautet " + umfang + " cm");

    }

    public static void flaeche (int breite, int laenge) {
    int flaeche = breite * laenge;
        System.out.println("Die Fläche beträgt " + flaeche + " cm");

    }
}
