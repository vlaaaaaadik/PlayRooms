package Source.Child;

import Source.Room.PlayRoom;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.LinkedList;
import java.util.List;

public class Children {
    private static List<Child> children;
    private static String filename = "childrenList.dat";

    public static String getFilename() {
        return filename;
    }

    static {
        children = new LinkedList<Child>();

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            children=((LinkedList<Child>)ois.readObject());
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public static List<Child> getChildren() {
        return children;
    }

}
