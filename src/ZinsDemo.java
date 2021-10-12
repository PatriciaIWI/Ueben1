public class ZinsDemo {
    public static void main(String[] args) {

Zinsberechnung(1000,2.25);

    }

    public static void Zinsberechnung (int kontostand, double Zinsatz) {
        double Zinsen = Zinsatz / 100 * kontostand;
        System.out.println("Aktuell betragen die Zinsen " + Zinsen);
    }
}
