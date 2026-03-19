package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {

    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testHasCityWithNewInstance()
    {
        CustomList list = new CustomList();
        list.addCity(new City("Edmonton", "AB"));
        City edmontonDuplicate = new City("Edmonton", "AB");
        assertTrue(list.hasCity(edmontonDuplicate));
    }

    @Test
    void testDelete() {
        CustomList list = new CustomList();
        City city = new City("Yellowknife", "NT");

        //addition so list isn't empty
        list.addCity(city);
        assertTrue(list.hasCity(city), "City should be in the list before deletion");

        //deletion
        list.delete(city);

        //verify it's gone
        assertFalse(list.hasCity(city), "City should not be in the list after deletion");
    }

    @Test
    void testDeleteException() {
        CustomList list = new CustomList();
        City city = new City("Regina", "SK");

        //verify that deleting a city not in the list throws the exception
        assertThrows(IllegalArgumentException.class, () -> {
            list.delete(city);
        });
    }


    @Test
    public void testCountCities()
    {
        CustomList list = new CustomList();
        list.addCity(new City("Charlottetown", "PE"));
        assertEquals(1, list.countCities()); // This will now FAIL because the method returns 0
    }

}
