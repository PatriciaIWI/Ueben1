package LV4;

import java.util.ArrayList;

public class Wasserstandmanager {

        ArrayList<Wasserstand> Wasserstandlist = new ArrayList<Wasserstand>();
        public static void main(String[] args) {

            Wasserstandmanager manager = new Wasserstandmanager();
            manager.add(new Wasserstand(1,"Mur",300,500,5000));
            manager.add(new Wasserstand(2,"Drau",400,600,4000));
            manager.add(new Wasserstand(3,"Donau",500,700,3000));
            manager.add(new Wasserstand(4,"Inn",700,650,2000));
            manager.add(new Wasserstand(5,"Salzach",450,750,1000));

            Wasserstand w1 = manager.findById(3);
            Wasserstand w5 = manager.findById(5);
           ArrayList<Wasserstand> Mur = manager.findAllByGewaesser("Mur");
           Wasserstand Drau = manager.findLastWasserstand("Drau");
           ArrayList<Wasserstand> Alarmsout = manager.findForAlarmierung();
           ArrayList<Wasserstand> Zeit = manager.findByZeitpunkt(3000,6000,"Mur");

            double Mittel = manager.calcMittlererWasserstand("Donau");
            System.out.println(Mittel);
            System.out.println(Zeit);
            System.out.println("ALARM!!! " + Alarmsout);
            System.out.println(Mur);
            System.out.println(Drau);
          System.out.println(w1);
          System.out.println(w5);

        }

   public void add (Wasserstand w){

            Wasserstandlist.add(w);
   }

    public Wasserstand findById(int id) {
        //return new Wasserstand(512,"Dummy",450,750,3000);
        //return findById(1);
        for (Wasserstand ws : Wasserstandlist) {
            if (ws.getId() == id){
                return ws;
            }
        }
        return null;
    }

    public ArrayList<Wasserstand> findAllByGewaesser(String gewaesserName1) {
            ArrayList<Wasserstand> wslist = new ArrayList<>();
        for (Wasserstand wsname : Wasserstandlist) {
            if (wsname.getGewaesserName().equals(gewaesserName1)){
           wslist.add(wsname) ;
            }
       }
        return wslist;
    }

    public Wasserstand findLastWasserstand(String gewaesserName2) {
            int Sec = 0;
       Wasserstand LastWS = null;
        for (Wasserstand wstime : Wasserstandlist) {
            if (wstime.getGewaesserName().equals(gewaesserName2))
            {if (wstime.getZeitpunkt() > Sec){
                LastWS = wstime;
                Sec = wstime.getZeitpunkt();

            }
            }
           /* Liefert den neuesten Wasserstand (= jener mit dem größten Zeitpunkt) für das Gewässer mit dem
            übergebenen Namen.*/
        }
        return LastWS;
    }

    public ArrayList<Wasserstand> findForAlarmierung() {
         ArrayList<Wasserstand> alarm = new ArrayList();
        for (Wasserstand wsalarm : Wasserstandlist) {
            if (wsalarm.getMessWert() >= wsalarm.getMessWertFuerAlarmierung()) {
                alarm.add(wsalarm);
            }
        }
/*        Liefert alle Wasserstände, deren aktueller Wasserstand höher oder gleich wie dessen Wert
        messWertFuerAlarmierung ist */
        return alarm;
    }

    public double calcMittlererWasserstand(String gewaesserName4) {
        for (Wasserstand wsmittel : Wasserstandlist) {
            if (wsmittel.getGewaesserName().equals(gewaesserName4) ) {
return wsmittel.getMessWert() / 5;
            }
        }
            return 0;
     /*   Liefert den durchschnittlichen Wasserstand für das Gewässer mit dem übergebenen Namen zurück.*/

    }

    public ArrayList<Wasserstand> findByZeitpunkt(int von, int bis, String
            gewaesserName3) {
            ArrayList<Wasserstand> Zeit = new ArrayList<>();
       for (Wasserstand wsvonbis : Wasserstandlist) {
            if (gewaesserName3.equals(wsvonbis.getGewaesserName()) && wsvonbis.getZeitpunkt() >= von && wsvonbis.getZeitpunkt() <= bis){
            Zeit.add(wsvonbis);
            }
        }
        return Zeit;
      /*  Liefert die Wasserstände für das Gewässer mit dem übergebenen Namen am angegebenen Ort, die
        zwischen oder zu den Zeitpunkten von und bis gemessen wurden.*/
        }
}