package Menu.Commands.Rooms;

import Menu.Commands.ICommand;
import Menu.Menus.ScannerSingleton;
import Source.Child.Children;
import Source.Room.Rooms;
import Source.Room.Shop;

import java.util.List;

public class ShoppingForRoom implements ICommand {
    private int room;
    private ScannerSingleton scanner = ScannerSingleton.getInstance();
    @Override
    public void execute() {
        Shop.setClient(Rooms.getRooms().get(room));
        while (true) {
            for (int i = 0; i < Shop.getToys().size(); i++) {
                System.out.println((i + 1) + " " + Shop.getToys().get(i).toString());
            }
            String choosenToy = scanner.nextLine();
            if(choosenToy.equals("e")){
                break;
            }else if (isNumeric(choosenToy)){
                Shop.sellToy(Integer.valueOf(choosenToy) - 1);
            }
        }
    }

    private static boolean isNumeric(String strNum) {
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }

    public ShoppingForRoom(int room){
        this.room = room;
    }
}
