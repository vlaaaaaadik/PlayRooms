package Menu.Menus.Rooms;

import Menu.Commands.Rooms.ChooseRoomCommand;
import Menu.Commands.ICommand;
import Menu.Menus.Main.Menu;
import Source.Room.PlayRoom;
import Source.Room.Rooms;

import java.util.HashMap;
import java.util.List;

public class ChooseRoomMenu extends Menu {

        public ChooseRoomMenu(){
            commands = new HashMap<String, ICommand>();
            updateList();
        }
        public void updateList(){
            List<PlayRoom> rooms = Rooms.getRooms();
            for(int i = 0; i <rooms.size(); i++){
                commands.put(String.valueOf(i + 1), new ChooseRoomCommand(i));
            }
        }
}
