package Menu.Menus.Children;

import Menu.Commands.Children.ChooseChildCommand;
import Menu.Commands.ICommand;
import Menu.Commands.Rooms.ChooseRoomCommand;
import Menu.Menus.Main.Menu;
import Source.Child.Child;
import Source.Child.Children;
import Source.Room.PlayRoom;
import Source.Room.Rooms;

import java.util.HashMap;
import java.util.List;

public class ChooseChildMenu extends Menu {
    public ChooseChildMenu(){
        commands = new HashMap<String, ICommand>();
        updateList();
    }
    public void updateList(){
        List<Child> children = Children.getChildren();
        for(int i = 0; i <children.size(); i++){
            commands.put(String.valueOf(i + 1), new ChooseChildCommand(i));
        }
    }
}

