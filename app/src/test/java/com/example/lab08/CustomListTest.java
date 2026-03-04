package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City edmonton = new City("edmonton", "AB");
        list.addCity(edmonton);
// This will fail initially because hasCity() doesn't
        assertTrue(list.hasCity(edmonton));
    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City edmonton = new City("Edmonton", "AB");
        list.addCity(edmonton);
// This will fail initially because hasCity() doesn't
        assertTrue(list.hasCity(edmonton));

        list.deleteCity(edmonton);
        assertFalse(list.hasCity(edmonton));
    }

    @Test
    public void testCountCities() {
        CustomList list = new CustomList();
        City redDeer = new City("Red Deer", "AB");
        City lethbridge = new City("Lethbridge", "AB");
        list.addCity(redDeer);
        list.addCity(lethbridge);

        assertEquals(2, list.countCity());
    }
}
