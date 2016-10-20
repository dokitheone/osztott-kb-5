public class Gondozo implements java.io.Serializable {
    private String nev;
    private int fizu; //óradíj!!

    public Gondozo(String nev, int fizu) {
        this.nev = nev;
        this.fizu = fizu;
    }    

    public int getFizu() {
        return fizu;
    }
}
