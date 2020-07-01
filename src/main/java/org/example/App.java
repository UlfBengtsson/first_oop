package org.example;

import org.example.models.Car;
import org.example.models.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Amount of car objects created at this point: " + Car.getIdCounter() );

        Car myFirstCar = new Car();

        boolean worked = myFirstCar.setBrand("Saab");

        System.out.println("Amount of car objects created at this point: " + Car.getIdCounter() );
        System.out.println("Car id: " + myFirstCar.getId() + " Brand: " + worked + " " + myFirstCar.getBrand());

        Car myCurrentCar = new Car("BMW","525i","ABC123");

        System.out.println("Amount of car objects created at this point: " + Car.getIdCounter() );
        System.out.println("Car id: " + myCurrentCar.getId() + " Brand: " + myCurrentCar.getBrand());

        Person ulf = new Person("Ulf", myCurrentCar);

        System.out.println( ulf.infomation() );
    }
}
