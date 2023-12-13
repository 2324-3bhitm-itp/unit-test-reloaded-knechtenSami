package at.ac.htl.leonding.bhitm3;

public class Plant {

    private String name;
    private PlantType type;
    private int waterDemandIndicator;

    public Plant(String name, PlantType type, int waterDemandIndicator) {
        this.name = name;
        this.type = type;
        this.waterDemandIndicator = waterDemandIndicator;
    }

    public Plant() {
    }

    public String getName() {
        return name;
    }

    public PlantType getType() {
        return type;
    }

    public int getWaterDemandIndicator() {
        return waterDemandIndicator;
    }

    public void water() {
        waterDemandIndicator = 0;
    }

    public int increaseWaterDemandIndicator(int amount) {
        this.waterDemandIndicator += amount;
        return waterDemandIndicator;
    }
}
