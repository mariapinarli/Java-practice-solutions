package day36_polymorphism;

import day34_abstraction.car_task.*;
import day34_abstraction.car_task.Honda;

import java.util.ArrayList;

public class CarShop {
    public static void main(String[] args) {

        Car[] cars = {
                new Honda("Pilot", 2010, 25000, "White"),
                new Audi("Q6", 2014, 32000, "Red"),
                new Honda("Accord", 2011, 20000, "White"),
                new Audi("Q4", 2015, 33000, "Blue"),
                new Audi("A7", 2019, 35000, "Black"),
                new Audi("Q8", 2018, 40000, "White"),
                new Audi("Q5", 2009, 30000, "Purple"),
                new Audi("A4", 2011, 30000, "Black"),
                new Honda("Civic", 2018, 30000, "Red"),
                new Honda("CR-V", 2012, 23000, "Red"),
                new Honda("HR-V", 2019, 35000, "Blue"),
                new Tesla("Model 3", 2015, 45000, "White"),
                new Tesla("Model Y", 2017, 65000, "Black"),
                new Tesla("Model X", 2016, 48000, "White"),
                new Tesla("Model X", 2014, 48000, "Blue")
        };

        /*
            1.2. Display all cars eligible for recall:
            - Honda: Years 2010 to 2011
            - Audi: Years 2015 to 2019
            - Tesla: Years 2015 to 2016
         */

        for(Car car : cars){
            int year = car.getYear();
            boolean forHonda = car instanceof Honda && year >= 2010 && year <= 2011;
            boolean forAudi = car instanceof Audi && year >= 2015 && year <= 2019;
            boolean forTesla = car instanceof Tesla && year >= 2015 && year <= 2016;
            if(forHonda || forAudi || forTesla){
                System.out.println(car);
            }

        }

        System.out.println("--------------------------------------");

        //1.3. Display the car with the highest price.
        //1.4. Display the car with the lowest price.

        Car highestPriceCar = cars[0];
        Car lowestPriceCar = cars[0];
        for(Car each : cars){
            if(each.getPrice() > highestPriceCar.getPrice()){
                highestPriceCar = each;
            } else if (each.getPrice() < lowestPriceCar.getPrice()){
                lowestPriceCar = each;
            }
        }

        System.out.println("Highest Priced Car: " + highestPriceCar);
        System.out.println("Lowest Priced Car: " + lowestPriceCar);
        System.out.println("--------------------------------------");

        //1.5. Create an ArrayList of Tesla named 'teslaCars' and store all Tesla cars from the cars array.

        ArrayList<Tesla> telsaCars = new ArrayList<>();
        for(Car eachCar : cars){
            if(eachCar instanceof Tesla){
                telsaCars.add((Tesla) eachCar);
            }
        }

        System.out.println("Tesla cars: " + telsaCars);


    }
}

/*
CarShop Class Task:
1. Create a Class Named 'CarShop':
    - Given an array of Car objects:
        Car[] cars = {
                new Honda("Pilot", 2010, 25000, "White"),
                new Audi("Q6", 2014, 32000, "Red"),
                new Honda("Accord", 2011, 20000, "White"),
                new Audi("Q4", 2015, 33000, "Blue"),
                new Audi("A7", 2019, 35000, "Black"),
                new Audi("Q8", 2018, 40000, "White"),
                new Audi("Q5", 2009, 30000, "Purple"),
                new Audi("A4", 2011, 30000, "Black"),
                new Honda("Civic", 2018, 30000, "Red"),
                new Honda("CR-V", 2012, 23000, "Red"),
                new Honda("HR-V", 2019, 35000, "Blue"),
                new Tesla("Model 3", 2015, 45000, "White"),
                new Tesla("Model Y", 2017, 65000, "Black"),
                new Tesla("Model X", 2016, 48000, "White"),
                new Tesla("Model X", 2014, 48000, "Blue")
        };

    - Tasks:
        1.2. Display all cars eligible for recall:
            - Honda: Years 2010 to 2011
            - Audi: Years 2015 to 2019
            - Tesla: Years 2015 to 2016
        1.3. Display the car with the highest price.
        1.4. Display the car with the lowest price.
        1.5. Create an ArrayList of Tesla named 'teslaCars' and store all Tesla cars from the cars array.
 */