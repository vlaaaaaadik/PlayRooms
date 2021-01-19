package Menu.Commands.Rooms;

import Menu.Commands.ICommand;
import Menu.Menus.Rooms.RoomManageMenu;
import Menu.Menus.ScannerSingleton;
import Source.Room.Rooms;

public class ChooseRoomCommand implements ICommand {
    private int room;
    private RoomManageMenu menu;
    private ScannerSingleton scanner = ScannerSingleton.getInstance();
    @Override
    public void execute() {
        while (true) {
            System.out.println("        1) add child");
            System.out.println("        2) buy a toy for this room");
            System.out.println("        3) exit");
            Rooms.getRooms().get(room);
            String line = scanner.nextLine();
            if(line.equals("3")){
                break;
            }
            menu.executeCommand(line);
        }
    }

    public ChooseRoomCommand(int room){
        this.room = room;
        menu = new RoomManageMenu(room);
    }
}
