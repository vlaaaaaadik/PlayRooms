package Menu.Commands.Rooms;

import Menu.Commands.ICommand;
import Menu.Menus.ScannerSingleton;
import Source.Room.PlayRoom;
import Source.Room.Rooms;

import java.sql.Time;

public class CreateRoomCommand implements ICommand {
    @Override
    public void execute() {
        ScannerSingleton scaner = ScannerSingleton.getInstance();
        System.out.println("enter name of the room");
        String name = scaner.nextLine();
        System.out.println("enter maximum children in the room");
        int maxChildren = scaner.nextInt();
        System.out.println("enter budget");
        double budget = scaner.nextDouble();
        System.out.println("enter open time");
        System.out.println("enter hour");
        int hour = scaner.nextInt();
        System.out.println("enter minute");
        int minute = scaner.nextInt();
        Time openTime = new Time(hour, minute, 0);
        System.out.println("enter close time");
        System.out.println("enter hour");
        hour = scaner.nextInt();
        System.out.println("enter minute");
        minute = scaner.nextInt();
        System.out.println("enter price for enter");
        int price = scaner.nextInt();
        Time closeTime = new Time(hour, minute, 0);
        Rooms.getRooms().add(new PlayRoom(name, maxChildren, budget, openTime, closeTime, price));

    }
}

