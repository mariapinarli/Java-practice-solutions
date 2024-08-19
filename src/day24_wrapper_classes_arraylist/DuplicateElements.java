package day24_wrapper_classes_arraylist;
import java.util.ArrayList;
import java.util.Arrays;
public class DuplicateElements {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5 ));

        int size = list.size();
        System.out.println(size);
        for (int i = 0; i < size; i++) {
            list.add(list.get(i));

        }

        System.out.println(list);

        System.out.println("-----------------------------------------");
        // option 2

        ArrayList< Integer > list1 = new ArrayList<>(Arrays.asList( 1,2,3,4,5));
        list1.addAll(list1);

        System.out.println(list1);

    }
}
/*
3. Create a class called DuplicateElements and write a program with the following specifications:
   3.1 Given an ArrayList, duplicate each element in the list.

		 	Example:
                list = [1,2,3,4,5];

            output:
            	[1,2,3,4,5,1,2,3,4,5];
 */