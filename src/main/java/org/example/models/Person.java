package org.example.models;

public class Person {
    private static int idCounter = 0;

    private int id;
    private String name;
    private Car carOwed;

    public Person(String name, Car car) {
        this.id = idCounter++;
        this.name = name;
        this.carOwed = car;
    }

    public String information() {
        return  "Id: " + id +
                " Name: " + name +
                " Car id of owed: " + carOwed.getId();
    }
}
