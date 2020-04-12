package Game;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws FileNotFoundException {

        Simulation simulation = new Simulation();

        ArrayList<Item> itemsPhase1 = simulation.loadItems("phase-1.txt");
        ArrayList<Item> itemsPhase2 = simulation.loadItems("phase-2.txt");

        System.out.println(itemsPhase1.get(0).getName());
        System.out.println(itemsPhase1.get(0).getWeight());

    }

}