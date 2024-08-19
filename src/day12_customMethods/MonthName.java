package day12_customMethods;



public class MonthName {

    public static void main(String[] args) {

        monthName(6);
        monthName(3);
        monthName(13);


    }
    public static void monthName( int number){


        String month = switch (number){

            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid Number";

        };
        System.out.println(month);




    }




}
/*
Create a method named monthName that can display the name of the month based on the given number to the method,
if the number is invalid, then the method should print the error message "Invalid Number"
    Ex:
        monthName(6)

        output:
            June
 */