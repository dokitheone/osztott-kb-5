import java.util.*;

public class Allatkert implements java.io.Serializable {
    private List<Ketrec> ketrecek;    
    private List<Gondozo> gondozok;

    public Allatkert(List<Ketrec> ketrecek, List<Gondozo> gondozok) {
        this.ketrecek = ketrecek;
        this.gondozok = gondozok;
    }    
    
    public double etetesIdeje() {
        double sum = 0.0;
        for(Ketrec k : ketrecek) {
            sum += k.getMenny() * k.getIdo();
        }
        return sum;
    }
    
    public double koltseg() {
        double fizuk = 0.0;
        for(Gondozo g : gondozok) {
            fizuk += g.getFizu();
        }
        double idoH = Math.ceil(this.etetesIdeje() / 60);
        return fizuk * idoH;
    }
}
