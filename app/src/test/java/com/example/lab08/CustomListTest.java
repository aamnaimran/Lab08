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
        City city = list.getCities().get(0);
        list.delete(city); // test removal
        assertFalse(list.hasCity(city));
    }


//    @Test
//    public void testCountCities()
//    {
//        CustomList list = new CustomList();
//    }

}
