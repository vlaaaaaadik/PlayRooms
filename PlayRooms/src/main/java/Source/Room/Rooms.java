package Source.Room;

import Source.Room.PlayRoom;
import Source.Toys.Toy;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.LinkedList;
import java.util.List;

public  class Rooms {
    private static List<PlayRoom> rooms;
    private static String filename = "roomsList.dat";
    static {
        rooms = new LinkedList<PlayRoom>();

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            rooms=((LinkedList<PlayRoom>)ois.readObject());
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public static String getFilename() {
        return filename;
    }

    public static List<PlayRoom> getRooms() {
        return rooms;
    }

}
