package LV4;

import java.util.ArrayList;

public class Wasserstandmanager {
        public static void main(String[] args) {


        ArrayList<Wasserstand> Wasserstandlist = new ArrayList<Wasserstand>();
        Wasserstandlist.add(new Wasserstand());
        Wasserstandlist.add(new Wasserstand());
        Wasserstandlist.add(new Wasserstand());
        Wasserstandlist.add(new Wasserstand());
        Wasserstandlist.add(new Wasserstand());
    }

    public Wasserstand findById(int id) {
getId;

        return findById(1);
    }

    public ArrayList<Wasserstand> findAllByGewaesser(String gewaesserName) {



        return null;
    }

    public Wasserstand findLastWasserstand(String gewaesserName) {
        return null;

    }

    public ArrayList<Wasserstand> findForAlarmierung() {

        return null;
    }

    public double calcMittlererWasserstand(String gewaesserName, String ort) {

        return 0;
    }

    public ArrayList<Wasserstand> findByZeitpunkt(int von, int bis, String
            gewaesserName, String ort) {
        return null;
    }


}