import java.io.File;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Rom Sorter");
        System.out.println("--------------------");

        boolean validFolder = false;

        //Loop until an actual folder directory is given
        while (!validFolder) {
            System.out.print("Please enter the exact folder path of your rom location:");
            String path = sc.nextLine().trim();

            File file = new File(path);

            if(file.isDirectory() && file.exists()) {
                validFolder = true;
                //Pass the directory ready to scan all the roms/files
                RomScanner.scanRoms(file);
            } else {
                System.out.println(path + " was not a valid rom location.");
            }
        }
        sc.close();
    }
}
