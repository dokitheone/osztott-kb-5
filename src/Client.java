import java.io.*;
import java.net.*;
import java.util.*;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("localhost", 8080);
        System.out.println("Sikeres kapcsolodas a szerverrel.");
                
        List<Ketrec> ket = new ArrayList<>();
        for(int i = 1; i <= 5; i++) {
            ket.add(new Ketrec("Ketrec-" + i, i*10, i));
        }
        List<Gondozo> gon = new ArrayList<>();
        for(int i = 1; i <= 10; i++) {
            gon.add(new Gondozo("Gondozo-" + i, i*10));
        }
        Allatkert zoo = new Allatkert(ket, gon);
        
        ObjectOutputStream oos = new ObjectOutputStream(client.getOutputStream());
        oos.writeObject(zoo);
        System.out.println("'Uzenet' elkuldve.");
        
        Scanner sc = new Scanner(client.getInputStream());
        ArrayList<String> valasz = new ArrayList<>();
        while(sc.hasNextLine()) {            
            valasz.add(sc.nextLine());
        }
        System.out.println("Az allatkert etetesi ideje: " + valasz.get(0));
        System.out.println("Az allatkert koltsege: " + valasz.get(1));    
        
        sc.close();
        client.close();
        System.out.println("A kliens leallt.");
    }
}