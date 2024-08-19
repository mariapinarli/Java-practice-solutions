package day12_customMethods;

public class Day {
    public static void main(String[] args) {
        day(5);
        day(3);
        day(8);

    }

    public static void day(int number){

        String day = switch (number) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "invalid Number";
        };
        System.out.println(day);


        /* 2.approach

        String day;
        switch (number){
            case 1: day = "Monday"; break;
            case 2: day = "Tuesday"; break;
            case 3: day = "Wednesday"; break;
            case 4: day = "Thursday"; break;
            case 5: day = "Friday"; break;
            case 6: day = "Saturday"; break;
            case 7: day = "Sunday"; break;
            default: day = "Invalid Number";
        }

        System.out.println(day);
         */

    }


}
/*
Create a method named day that can display
the name of the day based on the given number
to the method, if the number is invalid, then
the method should print the error message "Invalid Number"
    Ex:
        day(5)

    output:
        Friday
 */