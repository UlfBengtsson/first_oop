package org.example;

import org.example.models.Car;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Car myFirstCar = new Car();

        boolean worked = myFirstCar.setBrand("Saab");

        System.out.println("Brand: " + worked + " " + myFirstCar.getBrand());
    }
}
