package day24_wrapper_classes_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLetters {
    public static void main(String[] args) {


        ArrayList<Character> chars = new ArrayList<>(Arrays.asList(
                '$', 'A', 'B', '1', '2', 'c', 'd', '@', '!', '3', '4'
        ));

        chars.removeIf(p-> Character.isLetter(p));

        System.out.println(chars);


        /*
        Performans: removeIf metodu dahili olarak bir döngü kullanır
        ve liste üzerinde teker teker dolaşarak koşulu kontrol eder.
        Bu, manuel bir döngü yazmak yerine daha temiz ve kısa bir çözümdür.

        Performance: The removeIf method internally uses a loop and iterates over the list,
         checking the condition for each element.
         This is a cleaner and shorter solution compared to writing a manual loop.
      */





    }
}

/*
10. Create a class called RemoveLetters and write a program with the following steps:
    10.1 Given an ArrayList of characters, remove all the letters.

    Example:
        list = {'$', 'A', 'B', '1', '2', 'c', 'd', '@', '!', '3', '4'}

    output:
        ['$',  '1', '2', '@', '!', '3', '4']
 */