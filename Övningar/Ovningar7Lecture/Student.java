package Collection;

public class Student {
    String namn;
    int telefonNr;
    boolean aktiv;

    Student (String namn, int Tnr, boolean aktiv) {
        this.namn = namn;
        telefonNr = Tnr;
        this.aktiv = aktiv;
    }
    public String getNamn() {
        return namn;
    }
    public int getTelefonNr() {
        return telefonNr;
    }
}
