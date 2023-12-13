package at.ac.htl.leonding.bhitm3;

import java.util.LinkedList;
import java.util.List;

public class Garden {

    private static int idCounter = 0;

    private List plants = new LinkedList<>();
    private int id;

    public Garden() {
        id = idCounter++;
    }

    public List getPlants() {
        return plants;
    }

    public void addPlant(Plant plant) {
        plants.add(plant);
    }

    public int getId() {
        return id;
    }
    
}
