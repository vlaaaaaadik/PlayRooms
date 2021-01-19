package Menu.Commands.Children;

import Menu.Commands.ICommand;
import Menu.Menus.ScannerSingleton;
import Source.Child.Child;
import Source.Child.Children;

import java.util.*;

public class CreateChildCommand implements ICommand {

    @Override
    public void execute() {
        ScannerSingleton scanner = ScannerSingleton.getInstance();
        System.out.println("enter name");
        String name = scanner.nextLine();
        System.out.println("Enter birthdate");
        System.out.println("Enter year");
        int year = scanner.nextInt();
        System.out.println("Enter month");
        int month = scanner.nextInt();
        System.out.println("Enter day");
        int day = scanner.nextInt();
        Calendar birthdate = new GregorianCalendar(year,month-1,day);
        System.out.println("enter Parents phone");
        String phone = scanner.nextLine();
        phone = scanner.nextLine();
        Children.getChildren().add(new Child(name,birthdate.getTime(),phone));
    }
}
