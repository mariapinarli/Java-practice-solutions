package day09_scanner;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius");
        double r = input.nextDouble();

        input.close();

        double area = r * r * 3.14;
        double perimeter = 2 * r * 3.14;

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);




    }

}
/*
2. Create a class named Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius
 */