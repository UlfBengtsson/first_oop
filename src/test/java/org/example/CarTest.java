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
    public void brandModelRegCarConstructor() {
        //Arrange
        Car testCar;
        int counterBefore = 0;
        int counterAfter = 0;
        String brand= "Volvo";
        String modelName = "740";
        String regPlate = "QWE098";

        //Act
        counterBefore = Car.getIdCounter();
        testCar = new Car(brand, modelName, regPlate);
        counterAfter = Car.getIdCounter();

        //Assert
        assertEquals(brand, testCar.getBrand());
        assertEquals(modelName, testCar.getModelName());
        assertEquals(regPlate, testCar.getRegPlate());
        assertEquals(0, testCar.getMaxSpeed());
        assertEquals(1, testCar.getId());
        assertEquals(counterBefore + 1, counterAfter);
    }

    //---- MaxSpeed ----

    @Test
    public void goodSpeed() {
        //Arrange
        int speedLimit = 250;
        Car testCar = new Car();

        //Act
        boolean result = testCar.setMaxSpeed(speedLimit);
        int testCarMaxSpeed = testCar.getMaxSpeed();

        //Assert
        assertTrue(result);
        assertEquals(speedLimit, testCarMaxSpeed);
    }

    @Test
    public void badNegativeSpeed() {
        //Arrange
        int speedLimit = -1;
        Car testCar = new Car();

        //Act
        boolean result = testCar.setMaxSpeed(speedLimit);
        int testCarMaxSpeed = testCar.getMaxSpeed();

        //Assert
        assertFalse(result);
        assertEquals(0, testCarMaxSpeed);
    }

    //---- Brand ----

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

    //---- ModelName ----

    @Test
    public void badModelName() {
        //Arrange
        Car testCar = new Car();
        String badName = "";

        //Act
        boolean result = testCar.setBrand(badName);

        //Assert
        assertFalse(result);
        assertEquals(DEFAULT_MODELNAME, testCar.getModelName());
    }

    @Test
    public void badNullModelName() {
        //Arrange
        Car testCar = new Car();
        String badName = null;

        //Act
        boolean result = testCar.setModelName(badName);

        //Assert
        assertFalse(result);
        assertEquals(DEFAULT_MODELNAME, testCar.getModelName());
    }

    @Test
    public void goodModelName() {
        //Arrange
        String model = "900S";
        Car testCar = new Car();

        //Act
        boolean result = testCar.setModelName(model);
        String currentCarModel = testCar.getModelName();

        //Assert
        assertTrue(result);
        assertEquals(model, currentCarModel);
    }

    //---- RegPlate ----

    @Test
    public void badRegPlate() {
        //Arrange
        Car testCar = new Car();
        String badName = "";

        //Act
        boolean result = testCar.setRegPlate(badName);

        //Assert
        assertFalse(result);
        assertEquals(DEFAULT_REGPLATE, testCar.getRegPlate());
    }

    @Test
    public void badNullRegPlate() {
        //Arrange
        Car testCar = new Car();
        String badName = null;

        //Act
        boolean result = testCar.setRegPlate(badName);

        //Assert
        assertFalse(result);
        assertEquals(DEFAULT_REGPLATE, testCar.getRegPlate());
    }

    @Test
    public void goodRegPlate() {
        //Arrange
        String model = "ABC123";
        Car testCar = new Car();

        //Act
        boolean result = testCar.setRegPlate(model);
        String currentCarModel = testCar.getRegPlate();

        //Assert
        assertTrue(result);
        assertEquals(model, currentCarModel);
    }
}
