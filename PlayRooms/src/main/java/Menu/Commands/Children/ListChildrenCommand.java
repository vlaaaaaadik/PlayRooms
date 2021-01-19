package Menu.Commands.Children;

import Menu.Commands.ICommand;
import Menu.Menus.Children.ChooseChildMenu;
import Menu.Menus.ScannerSingleton;
import Source.Child.Children;

public class ListChildrenCommand implements ICommand {
    ScannerSingleton scanner = ScannerSingleton.getInstance();
    ChooseChildMenu menu = new ChooseChildMenu();
    @Override
    public void execute() {
        for (int i = 0; i < Children.getChildren().size() ; i++) {
            System.out.println((i + 1) + " " + Children.getChildren().get(i));
        }

        menu.updateList();
        System.out.println("type e to exit");
        while (true) {
            String line = scanner.nextLine();
            if(line.equals("e")) break;
            menu.executeCommand(line);
        }

    }
}
