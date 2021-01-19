package Menu.Commands.Children;

import Menu.Commands.ICommand;
import Menu.Menus.ScannerSingleton;
import Source.Child.Children;
import Source.Room.Rooms;

public class ChooseChildCommand implements ICommand {
    private int child;
    private ScannerSingleton scanner = ScannerSingleton.getInstance();

    @Override
    public void execute() {
        while (true) {
            System.out.println("        1) Delete child");
            System.out.println("        2) exit");
            String line = scanner.nextLine();
            if(line.equals("1")){
                Children.getChildren().remove(child);
            }else if(line.equals("2")){
                break;
            }
        }

    }

    public ChooseChildCommand(int child){
        this.child = child;
    }
}
