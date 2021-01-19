package com.PlayRooms;

import Menu.Menus.MainMenu;
import Menu.Menus.Rooms.RoomManageMenu;
import Menu.Menus.ScannerSingleton;
import Source.Child.Child;
import Source.Child.Children;
import Source.Child.Disease;
import Source.Room.Rooms;
import Source.Room.Shop;
import Source.Toys.ArtToy;
import Source.Toys.MechanicalToy;
import Source.Toys.MusicalToy;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {
    static MainMenu menu;
    static void serialize(){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(Shop.getFilename())))
        {
            oos.writeObject(Shop.getToys());
            System.out.println("Toys have been written");
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(Rooms.getFilename())))
        {
            oos.writeObject(Rooms.getRooms());
            System.out.println("Rooms have been written");
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(Children.getFilename())))
        {
            oos.writeObject(Children.getChildren());
            System.out.println("Children have been written");
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    static void loop(){
        ScannerSingleton scanner = ScannerSingleton.getInstance();

        while (true) {
            menu = new MainMenu();
            System.out.println("1) Rooms");
            System.out.println("2) Children");
            System.out.println("3) exit");
            String line = scanner.nextLine();
            if(line.equals("3")) break;

            menu.executeCommand(line);
        }
    }
    public static void main(String[] args) {
        loop();
        serialize();
    }
}
