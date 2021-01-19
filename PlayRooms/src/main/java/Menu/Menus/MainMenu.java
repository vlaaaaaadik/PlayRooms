package Menu.Menus;

import Menu.Commands.Children.ChildrenCommand;
import Menu.Commands.ICommand;
import Menu.Commands.Rooms.RoomsCommand;
import Menu.Menus.Main.Menu;

import java.util.HashMap;

public class MainMenu extends Menu {

    public void executeCommand(String command ){
        if(commands.containsKey(command)) {
            commands.get(command).execute();
        } else {
            System.out.println("Command not found!");
        }
    }

    public MainMenu() {
        commands = new HashMap<String, ICommand>();
        commands.put("1", new RoomsCommand());
        commands.put("2", new ChildrenCommand());

    }

}
