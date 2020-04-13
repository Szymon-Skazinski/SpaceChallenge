package Game;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Simulation {

    public ArrayList loadItems (String fileName) throws FileNotFoundException {
        ArrayList<Item> itemsArray = new ArrayList<>();

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

    public ArrayList loadU1(ArrayList<Item> itemsArray){


        ArrayList<U1> U1_rocketArray = new ArrayList<>();
        U1 U1_rocket = new U1();

        U1_rocketArray.add(U1_rocket);      //first U1 rocket added to rocketsArray
        U1 lastShip = U1_rocketArray.get(U1_rocketArray.size()-1);


        for (Item item : itemsArray){
            if (lastShip.canCarry(item))
            {
                lastShip.carry(item);
            } else {
                lastShip = new U1();
                U1_rocketArray.add(lastShip);
                lastShip.carry(item);
            };
        }
        return U1_rocketArray;
    }

    public ArrayList loadU2(ArrayList<Item> itemsArray)  {

        ArrayList<U2> U2_rocketArray = new ArrayList<>();
        U2 U2_rocket = new U2();

        U2_rocketArray.add(U2_rocket);      //first U1 rocket added to rocketsArray
        U2 lastShip = U2_rocketArray.get(U2_rocketArray.size()-1);


        for (Item item : itemsArray){
            if (lastShip.canCarry(item))
            {
                lastShip.carry(item);
            } else {
                lastShip = new U2();
                U2_rocketArray.add(lastShip);
                lastShip.carry(item);
            };
        }
        return U2_rocketArray;
    }

    void runSimulation(ArrayList<Rocket> rocketArray)  {

        Class cl = rocketArray.get(0).getClass();
        String rocketType = "";
        int crashingCount = 0;

        if (cl == U1.class) {  rocketType = "U1";
        } else rocketType =  "U2";

        System.out.println(rocketType + "\n" );
        System.out.println("Min. number of " + rocketType +  " rockets that need to carry is " + rocketArray.size() );

        ArrayList<Rocket> rocketArray_tmp = new ArrayList<>();

        if (cl == U1.class){

                for (Rocket rocket : rocketArray){
                    if (rocket.launch() && rocket.land()) {
                        continue;
                    } else {
                        rocketArray_tmp.add(new U1());
                        crashingCount++;
                    }
                }
            }

        if (cl == U2.class){

            for (Rocket rocket : rocketArray){
                if (rocket.launch() && rocket.land()) {
                    continue;
                } else {
                    rocketArray_tmp.add(new U2());
                    crashingCount++;
                }
            }
        }

        rocketArray.addAll(rocketArray_tmp);
        rocketArray_tmp.clear();
        System.out.println("Total number of crashes is: " + crashingCount + ". We had to sent "+ rocketArray.size() + " rockets total so cost of the mission is: " + rocketArray.size()*rocketArray.get(0).getRocketCost()+ ".000.000$ ");



    }


}
