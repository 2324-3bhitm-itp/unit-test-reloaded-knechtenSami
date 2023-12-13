package at.ac.htl.leonding.bhitm3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class GardenTest {
    
    Garden garden;
    @Before
    public void setup() {
        garden = new Garden();
    }
    @Test
    public void given_new_garden_when_getting_plants_returns_list_of_plants() {
        assertEquals(0, garden.getPlants().size());
    }

    @Test
    public void given_new_garden_when_adding_plant_then_plant_is_in_list() {
        Plant plant = new Plant();
        garden.addPlant(plant);
        assertEquals(1, garden.getPlants().size());
        assertEquals(plant, garden.getPlants().get(0));
    }

    @Test
    public void given_new_garden_check_if_id_is_set_correctly() {
        Garden garden2 = new Garden();
        assertNotNull(garden.getId());
        assertNotNull(garden2.getId());
        assertNotEquals(garden.getId(), garden2.getId());
    }
}
