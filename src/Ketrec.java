public class Ketrec implements java.io.Serializable {
    private String nev;
    private int menny;
    private int ido;

    public Ketrec(String nev, int menny, int ido) {
        this.nev = nev;
        this.menny = menny;
        this.ido = ido;
    }

    public int getMenny() {
        return menny;
    }

    public int getIdo() {
        return ido;
    }
}
