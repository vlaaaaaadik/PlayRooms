package Menu.Menus.Children;

import Menu.Commands.Children.CreateChildCommand;
import Menu.Commands.ICommand;
import Menu.Commands.Children.ListChildrenCommand;
import Menu.Menus.Main.Menu;

import java.util.HashMap;

public class ChildrenMenu extends Menu {
    public ChildrenMenu() {
        commands = new HashMap<String, ICommand>();
        commands.put("1", new ListChildrenCommand());
        commands.put("2", new CreateChildCommand());
    }
}
