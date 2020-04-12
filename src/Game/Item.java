package Game;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Item {

    private String name;
    private int weight;

    Item (String n, int w){
        this.name = n;
        this.weight = w;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
}


