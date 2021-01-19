package Menu.Menus.Rooms;

import Menu.Commands.ICommand;
import Menu.Commands.Rooms.AddChildToRoomCommand;
import Menu.Commands.Rooms.CreateRoomCommand;
import Menu.Commands.Rooms.ListRoomsCommand;
import Menu.Commands.Rooms.ShoppingForRoom;
import Menu.Menus.Main.Menu;

import java.util.HashMap;

public class RoomManageMenu extends Menu {
    private int room;
    public RoomManageMenu(int room){
        commands = new HashMap<String, ICommand>();
        this.room = room;
        commands.put("1", new AddChildToRoomCommand(room));
        commands.put("2", new ShoppingForRoom(room));

    }
}
