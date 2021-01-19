package Menu.Commands.Rooms;

import Menu.Commands.ICommand;
import Menu.Menus.Rooms.ChooseRoomMenu;
import Menu.Menus.ScannerSingleton;
import Source.Room.PlayRoom;
import Source.Room.Rooms;

import java.util.List;

public class ListRoomsCommand implements ICommand {
    ChooseRoomMenu menu = new ChooseRoomMenu();
    ScannerSingleton scanner = ScannerSingleton.getInstance();
    @Override
    public void execute() {
        List<PlayRoom> rooms =  Rooms.getRooms();
        for (int i = 0; i < rooms.size(); i++){
            System.out.println((i + 1)+ " " + rooms.get(i).toString());
        }
        menu.updateList();
        scanner = ScannerSingleton.getInstance();
        System.out.println("type e to exit");
        while (true) {
            String line = scanner.nextLine();
            if(line.equals("e")) break;
            menu.executeCommand(line);
        }
    }
}
