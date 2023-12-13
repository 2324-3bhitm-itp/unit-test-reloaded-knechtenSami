package at.ac.htl.leonding.bhitm3;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PlantTest {
    
    Plant plant;
    @Before
    public void setup() {
        
    }
    @Test
    public void given_new_plant_test_constructor_and_getter() {
        Plant plant = new Plant();
        assertEquals(null, plant.getName());
        assertEquals(null, plant.getType());
        assertEquals(0, plant.getWaterDemandIndicator());

        Plant plant2 = new Plant("name", PlantType.FLOWER, 1);
        assertEquals("name", plant2.getName());
        assertEquals(PlantType.FLOWER, plant2.getType());
        assertEquals(1, plant2.getWaterDemandIndicator());
    }

    @Test
    public void given_plant_when_watered_then_water_demand_indicator_is_set_to_zero() {
        Plant plant = new Plant("name", PlantType.FLOWER, 1);
        assertEquals(1, plant.getWaterDemandIndicator());
        plant.water();
        assertEquals(0, plant.getWaterDemandIndicator());
    }

    @Test
    public void given_plant_when_water_demand_indicator_is_increased_then_it_is_increased() {
        Plant plant = new Plant("name", PlantType.FLOWER, 1);
        assertEquals(1, plant.getWaterDemandIndicator());
        plant.increaseWaterDemandIndicator(5);
        assertEquals(6, plant.getWaterDemandIndicator());
        plant.water();
        assertEquals(0, plant.getWaterDemandIndicator());
    }
}
