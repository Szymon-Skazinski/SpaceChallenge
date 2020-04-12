package Game;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

    public ArrayList loadItems (String fileName) throws FileNotFoundException {
        ArrayList<Item> itemsArray = new ArrayList();

        File fileScanner = new File(fileName);
        Scanner scanner = new Scanner(fileScanner);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] item_temp = line.split("=");
            Item item = new Item(item_temp[0], Integer.parseInt(item_temp[1]));
            itemsArray.add(item);
        }

        return itemsArray;
    }

    public ArrayList loadU1(ArrayList itemsArray){
        ArrayList U1_rocketArray = new ArrayList();
        return U1_rocketArray;
    }

    public ArrayList loadU2(ArrayList itemsArray){
        ArrayList U2_rocketArray = new ArrayList();
        return U2_rocketArray;
    }

    void runSimulation(ArrayList rocketArray){

    }




}
