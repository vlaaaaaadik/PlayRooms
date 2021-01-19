package Menu.Commands.Children;

import Menu.Commands.ICommand;
import Menu.Menus.Children.ChildrenMenu;
import Menu.Menus.ScannerSingleton;

public class ChildrenCommand  implements ICommand {
    private ChildrenMenu menu;
    private ScannerSingleton scanner;

    private void loop(){
        scanner = ScannerSingleton.getInstance();
        menu = new ChildrenMenu();
        while (true){
            System.out.println("    1) children data ");
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
