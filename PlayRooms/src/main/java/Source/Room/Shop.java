package Source.Room;

import Source.Toys.Toy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;

public class Shop {
    static List<Toy> toys;
    static PlayRoom client;
    static String filename = "toyList.dat";
    static {
        toys = new LinkedList<Toy>();

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename)))
        {
            toys=((LinkedList<Toy>)ois.readObject());
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
    }
    public static void sellToy(int index){
        if(index >= toys.size()){
            System.out.println("there is no toy with this index. Try again");
        } else {
            client.spendMoney(toys.get(index).getCost());
            client.addToy(toys.get(index));
            toys.remove(toys.get(index));
        }
    }

    public static String getFilename() {
        return filename;
    }

    public static List<Toy> getToys() {
        return toys;
    }

    public static void setClient(PlayRoom client) {
        Shop.client = client;
    }

    public static PlayRoom getClient() {
        return client;
    }
}
