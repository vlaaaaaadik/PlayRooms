package Menu.Menus;



import java.util.Scanner;

public class ScannerSingleton {
    private static ScannerSingleton instance;
    private Scanner scanner;
    private ScannerSingleton(){
        scanner = new Scanner(System.in);
    }

    public static ScannerSingleton getInstance() {
        if(instance == null) {
            instance = new ScannerSingleton();
        }
        return instance;
    }

    public String nextLine(){
        return scanner.nextLine();
    }
    public int nextInt(){
        return scanner.nextInt();
    }
    public double nextDouble(){
        return scanner.nextDouble();
    }
}
