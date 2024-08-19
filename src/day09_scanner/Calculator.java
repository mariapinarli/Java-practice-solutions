package day09_scanner;

import java.nio.charset.StandardCharsets;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double n1 = scanner.nextDouble();

        System.out.println("Enter the math operator: ");
        char operator = scanner.next().charAt(0);

        System.out.println("Enter the second number: ");
        double n2 = scanner.nextDouble();

        scanner.close();

        switch(operator){
            case '-':
                System.out.println(n1-n2);
                break;
            case '+':
                System.out.println(n1+n2);
                break;
            case '*':
                System.out.println(n1*n2);
                break;
            case '/':
                System.out.println(n1/n2);
                break;

            default:
                System.out.println("invalid Operator");
        }



    }


}
