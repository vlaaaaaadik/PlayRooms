package Menu.Menus.Rooms;

import Menu.Commands.Rooms.CreateRoomCommand;
import Menu.Commands.ICommand;
import Menu.Commands.Rooms.ListRoomsCommand;
import Menu.Menus.Main.Menu;

import java.util.HashMap;

public class RoomsMenu extends Menu {
    public RoomsMenu(){
        commands = new HashMap<String, ICommand>();
        commands.put("1", new ListRoomsCommand());
        commands.put("2", new CreateRoomCommand());

    }
}
