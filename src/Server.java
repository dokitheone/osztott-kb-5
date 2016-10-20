import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket server = new ServerSocket(8080);
        System.out.println("A szerver elindult.");
	
        Socket client = server.accept();
        System.out.println("Egy kliens csatlakozott.");
        
        ObjectInputStream ois = new ObjectInputStream(client.getInputStream());
        System.out.println("Kliens 'uzenete' megkapva.");
        
        Allatkert zoo = (Allatkert) ois.readObject();
        
        double zooIdo = zoo.etetesIdeje();
        double zooKolt = zoo.koltseg();
        
        PrintWriter pw = new PrintWriter(client.getOutputStream(), true);
        pw.println(zooIdo);
        pw.println(zooKolt);
        //pw.println(zooIdo + " " + zooKolt);
        System.out.println("A valasz elkuldve.");        
        
        pw.close();
        server.close();
        System.out.println("A szerver leallt.");
    }
}
