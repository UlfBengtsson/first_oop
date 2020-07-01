package org.example;

import org.example.models.Car;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    private final String DEFAULT_BRAND = "No brand";
    private final String DEFAULT_MODELNAME = "No model";
    private final String DEFAULT_REGPLATE = "No reg";

    @Before
    public void resetBeforeTest() {
        Car.resetIdCounter();
    }

    @Test
    public void zeroCarConstructor() {
        //Arrange
        Car testCar;
        int counterBefore = 0;
        int counterAfter = 0;

        //Act
        counterBefore = Car.getIdCounter();
        testCar = new Car();
        counterAfter = Car.getIdCounter();

        //Assert
        assertEquals(DEFAULT_BRAND, testCar.getBrand());
        assertEquals(DEFAULT_MODELNAME, testCar.getModelName());
        assertEquals(DEFAULT_REGPLATE, testCar.getRegPlate());
        assertEquals(0, testCar.getMaxSpeed());
        assertEquals(1, testCar.getId());
        assertEquals(counterBefore + 1, counterAfter);
    }

    @Test
    public void badBrandName() {
        //Arrange
        Car testCar = new Car();
        String badName = "";

        //Act
        boolean result = testCar.setBrand(badName);

        //Assert
        assertFalse(result);
        assertEquals(DEFAULT_BRAND, testCar.getBrand());
    }

    @Test
    public void badNullBrandName() {
        //Arrange
        Car testCar = new Car();
        String badName = null;

        //Act
        boolean result = testCar.setBrand(badName);

        //Assert
        assertFalse(result);
        assertEquals(DEFAULT_BRAND, testCar.getBrand());
    }

    @Test
    public void goodBrandName() {
        //Arrange
        String brand = "Saab";
        Car testCar = new Car();

        //Act
        boolean result = testCar.setBrand(brand);
        String currentCarBrand = testCar.getBrand();

        //Assert
        assertTrue(result);
        assertEquals(brand, currentCarBrand);
    }
}
