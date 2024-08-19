package day11_string;

public class StartsWithX {
    public static void main(String[] args) {


        String str = "xcodez";

        if(str.charAt(0)== 'x'){
            str= str.replace("x", "a");
        }

        System.out.println(str);


    }
}
/*
Create a class named StartsWithX and write a program that asks user to enter a word. If the work starts with x, replace it with a.
        Input:
            xcodex
        Output:
            acodex

 */