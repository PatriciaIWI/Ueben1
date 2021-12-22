public class NotenDemo {

    public static void main(String[] args) {
        System.out.println(getNotentext(78));
        System.out.println(getNotentext(65));
        System.out.println(getNotentext(91));
        System.out.println(getNotentext(50));
        System.out.println(getNotentext(51));


    }
    public static String getNotentext(int Punkte){
        if (Punkte >= 90) {
            return "Sehr gut";
        }
        if (Punkte >= 78) {
            return "Gut";
        }
        if (Punkte >= 65) {
            return "Befriedigend";
        }
        if (Punkte >= 51) {
            return "Genügend";
        }
        if (Punkte <= 50) {
            return "Nicht Genügend";
        }

        return null;

    }
}
