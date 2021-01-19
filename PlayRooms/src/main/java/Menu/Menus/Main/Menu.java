package Menu.Menus.Main;

import Menu.Commands.ICommand;

import java.util.HashMap;

public abstract class Menu {
    protected HashMap<String, ICommand> commands;

    public void executeCommand(String command){
        if(commands.containsKey(command)) {
            commands.get(command).execute();
        } else {
            System.out.println("Command not found!");
        }
    }

}
