package LV4;

import java.util.Objects;

public class Wasserstand {
int id;
String gewaesserName;
    double messWert;
    double messWertFuerAlarmierung;
    int Zeitpunkt;

    public Wasserstand(int id, String gewaesserName, double messWert, double messWertFuerAlarmierung, int zeitpunkt) {
        this.id = id;
        this.gewaesserName = gewaesserName;
        this.messWert = messWert;
        this.messWertFuerAlarmierung = messWertFuerAlarmierung;
        Zeitpunkt = zeitpunkt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wasserstand that = (Wasserstand) o;
        return id == that.id && Double.compare(that.messWert, messWert) == 0 && Double.compare(that.messWertFuerAlarmierung, messWertFuerAlarmierung) == 0 && Zeitpunkt == that.Zeitpunkt && gewaesserName.equals(that.gewaesserName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, gewaesserName, messWert, messWertFuerAlarmierung, Zeitpunkt);
    }

    @Override
    public String toString() {
        return "Wasserstand{" +
                "id=" + id +
                ", gewaesserName='" + gewaesserName + '\'' +
                ", messWert=" + messWert +
                ", messWertFuerAlarmierung=" + messWertFuerAlarmierung +
                ", Zeitpunkt=" + Zeitpunkt +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGewaesserName() {
        return gewaesserName;
    }

    public void setGewaesserName(String gewaesserName) {
        this.gewaesserName = gewaesserName;
    }

    public double getMessWert() {
        return messWert;
    }

    public void setMessWert(double messWert) {
        this.messWert = messWert;
    }

    public double getMessWertFuerAlarmierung() {
        return messWertFuerAlarmierung;
    }

    public void setMessWertFuerAlarmierung(double messWertFuerAlarmierung) {
        this.messWertFuerAlarmierung = messWertFuerAlarmierung;
    }

    public int getZeitpunkt() {
        return Zeitpunkt;
    }

    public void setZeitpunkt(int zeitpunkt) {
        Zeitpunkt = zeitpunkt;
    }



}
