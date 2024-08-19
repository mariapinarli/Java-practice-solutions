package day24_wrapper_classes_arraylist;

public class LettersDigitsSpecialChars {
    public static void main(String[] args) {


        String str = "Wooden Spoon123!";

        String digit = "",
                letters = "",
                specialChars = ""; // initialize

        for( char eachChar : str.toCharArray() ){ // to convert from string to ArrayList
            if( Character.isLetter(eachChar) ){
                letters += eachChar;
            } else if ( Character.isDigit(eachChar)) {
                digit += eachChar;

            }else{
                specialChars += eachChar;
            }
        }

        System.out.println("letters = " + letters);
        System.out.println("digit = " + digit);
        System.out.println("specialChars = " + specialChars);

    }
}

/*
1. Create a class called LettersDigitsSpecialChars and write a program with the following specifications:
   1.1 Given a string, retrieve and display the letters, digits, and special characters separately.
   Example:

	        Example:
	            str = "Wooden Spoon123!"

	        output:
	            letters= "WoodenSpoon";
	            Digits = "123";
	            specialChars = " !";
 */