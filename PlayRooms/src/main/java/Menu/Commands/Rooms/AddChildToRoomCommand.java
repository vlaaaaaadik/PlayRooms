package Menu.Commands.Rooms;

import Menu.Commands.ICommand;
import Menu.Menus.ScannerSingleton;
import Source.Child.Child;
import Source.Child.Children;
import Source.Room.PlayRoom;
import Source.Room.Rooms;

import java.util.List;

public class AddChildToRoomCommand implements ICommand {
    private int room;
    private ScannerSingleton scanner = ScannerSingleton.getInstance();
    @Override
    public void execute() {
        while (true) {
            for (int i = 0; i < Children.getChildren().size(); i++) {
                System.out.println((i + 1) + " " + Children.getChildren().get(i));
            }
            System.out.println("enter e to exit");
            String line = scanner.nextLine();
            List<PlayRoom> rooms = Rooms.getRooms();
            if (isNumeric(line) && Integer.valueOf(line) <= Children.getChildren().size()) {
                int value = Integer.valueOf(line);
                if(rooms.get(room).isOpen() && rooms.get(room).getChildren().size() < rooms.get(room).getMaxChildren()) {
                    Rooms.getRooms().get(room).addChild(Children.getChildren().get(value - 1));
                    rooms.get(room).payForChild();
                    Children.getChildren().remove(value - 1);
                }else{
                    System.out.println("this room is closed or full");
                }
            } else if (line.equals("e")) {
                break;
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

    public AddChildToRoomCommand(int room){
        this.room = room;
    }
}
