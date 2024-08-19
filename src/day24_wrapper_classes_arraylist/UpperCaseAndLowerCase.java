package day24_wrapper_classes_arraylist;

public class UpperCaseAndLowerCase {


    public static void main(String[] args) {


        String str = "JAVA java";
        int upperCase = 0;
        int lowerCase = 0;

        for( char eachElement : str.toCharArray()){
            if( Character.isUpperCase(eachElement)){
                upperCase++;
            } else if (Character.isLowerCase(eachElement)) {
                lowerCase ++;
            }
        }

        if( upperCase == lowerCase){
            System.out.println("Equal");

        }else{
            System.out.println("Not equal");
        }



    }
}
