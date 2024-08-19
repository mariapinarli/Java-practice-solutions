package day24_wrapper_classes_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineTwoArrays {
    public static void main(String[] args) {


        String[] arr1 = { "A", "B", "C", "Z"};
        String[] arr2 = { "D", "E", "F", "G", "Y"};

        ArrayList<String> combined = new ArrayList<>();
        combined.addAll(Arrays.asList(arr1));
        combined.addAll(Arrays.asList(arr2));

        System.out.println(combined);

        System.out.println("-----------------------------------------");

        // option 2

        String [] arr3 = {"A", "B", "C"};
        String [] arr4 = {"D", "E", "F", "G"};

        ArrayList<String> list = new ArrayList<>();

        for(String each:arr3){
            list.add(each);
        }

        for(String each:arr4){
            list.add(each);
        }

        System.out.println(list);

        System.out.println("-------------------------------");

        // 3 approach
        ArrayList<String> combined2 = new ArrayList<>();
        int totallen = arr1.length + arr2.length; // total iteration

        for (int i = 0; i < totallen; i++) {
            if( i < arr1.length){
                combined2.add(arr1[i]);
            }else{
                combined2.add(arr2[i - arr1.length]); // Index is 3, arr1.length is 3
            } // so 3-3, so it starts adding the element to the RIGHT.
        }
        System.out.println(combined2);

    }
}


/*
4. Create a class called CombineTwoArrays and write a program with the following specifications:
   4.1 Given two String arrays, combine them into one ArrayList.

                Example:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};

                Output:
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */