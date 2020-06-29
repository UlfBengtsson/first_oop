package org.example;

import org.example.models.Car;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    private final String DEFAULT_BRAND = "No brand";
    private final String DEFAULT_MODELNAME = "No model";
    private final String DEFAULT_REGPLATE = "No reg";

    @Test
    public void zeroCarConstructor() {
        //Arrange
        Car testCar;

        //Act
        testCar = new Car();

        //Assert
        assertEquals(DEFAULT_BRAND, testCar.getBrand());
        assertEquals(DEFAULT_MODELNAME, testCar.getModelName());
        assertEquals(DEFAULT_REGPLATE, testCar.getRegPlate());
        assertEquals(0, testCar.getMaxSpeed());
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
}
