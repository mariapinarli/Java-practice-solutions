package day04_concatenation;
/*
Create a class named KilosToPounds and declare the following variables:
                kg
                lb

     Write a program that can convert the any given number of kilos to pounds
        Ex:
              kg = 10.5

        output:
              10.5 kilos is equal to 23.1 pounds

           Hint:  1kg = 2.2 lb
 */

public class KilosToPounds {
    public static void main(String[] args) {

        double kg = 10.5;

        double lb = kg * 2.2;

        System.out.println(kg + " kilos is equal to " + lb + " pounds");






    }
}
