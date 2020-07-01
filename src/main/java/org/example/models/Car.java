package org.example.models;

//D.R.Y.
//K.I.S.S.

public class Car {
    //static is bound to Car class and not Car object
    private static int idCounter = 0;//can also be seen as how many cars objects has bin created.

    //field
    private int id;
    private String regPlate;
    private String modelName;
    private String brand;

    private int maxSpeed;// defaults to 0 "zero"

    //if there is no constructor(s), java will make a "zero" constructor as default.
    public Car() {
        id = ++idCounter;
        setBrand("No brand");
        setModelName("No model");
        setRegPlate("No reg");
    }

    public Car(String brand, String modelName, String regPlate) {
        this();//will run the Car() constructor, remember this must be done on the first line inside the constructor.
        setBrand(brand);
        setModelName(modelName);
        setRegPlate(regPlate);
    }

    //Getters & Setters
    public int getId() {
        return id;
    }

    public String getRegPlate() {
        return regPlate;
    }

    public String getModelName() {
        return modelName;
    }

    public String getBrand() {
        return brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public boolean setBrand(String brand) {
        if (brand == null || brand.isEmpty()) {
            return false;
        }
        else {
            this.brand = brand;
            return true;
        }
    }

    public boolean setModelName(String modelName) {
        if (modelName == null || modelName.isEmpty()) {
            return false;
        }
        else {
            this.modelName = modelName;
            return true;
        }
    }

    public boolean setRegPlate(String regPlate) {
        if (regPlate == null || regPlate.isEmpty()) {
            return false;
        }
        else {
            this.regPlate = regPlate;
            return true;
        }

    }

    public boolean setMaxSpeed(int maximum) {
        if (maximum < 0) {
            return false;
        }
        else {
            maxSpeed = maximum;
            return true;
        }
    }

    public static int getIdCounter() {
        return idCounter;
    }

    //need this for testing
    public static void resetIdCounter() {
        idCounter = 0;
    }
}
