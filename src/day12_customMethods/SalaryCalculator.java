package day12_customMethods;

public class SalaryCalculator {
    public static void main(String[] args) {


        calculateSalary(45,40);
    }
    public static void calculateSalary( double hourlyRate, int weeklyHours){

        double salary = hourlyRate * weeklyHours * 52;

        System.out.println("You make $" + hourlyRate + " per hour");
        System.out.println("You work " + weeklyHours + " hours per week");
        System.out.println("Your gross income is $" + salary);
        System.out.println("Your monthly income is " + salary / 12);





    }
}
