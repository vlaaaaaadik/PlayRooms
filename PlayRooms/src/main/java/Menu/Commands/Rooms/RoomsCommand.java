package Menu.Commands.Rooms;

import Menu.Commands.ICommand;
import Menu.Menus.Rooms.RoomsMenu;
import Menu.Menus.ScannerSingleton;

public class RoomsCommand implements ICommand {
    RoomsMenu menu = new RoomsMenu();
    ScannerSingleton scanner;
    void loop(){
        scanner = ScannerSingleton.getInstance();
        while (true) {
            System.out.println("    1) view list");
            System.out.println("    2) Create new");
            System.out.println("    3) exit");
            String line = scanner.nextLine();
            if(line.equals("3")) break;
            menu.executeCommand(line);

        }
    }

    @Override
    public void execute() {
        loop();
    }
}
