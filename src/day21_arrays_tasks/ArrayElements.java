package day21_arrays_tasks;

public class ArrayElements {
    public static void main(String[] args) {


        // 1.1 Creat an array of integers with a length of 100.

        int[] nums = new int[100];

        // 1.2 Assign values from 1 to 100 to the indexes of the array.

        for (int i = 1; i <= 100 ; i++) {

            nums[i - 1]= i;
        }

        // nums[i-1] -> convert the i which is the number of an index

        System.out.println("// 1.3 Display the array elements in a single line separated by spaces.");
        for (int i = 0; i < nums.length ; i++) {
            System.out.print(nums[i] + " ");

        }
        System.out.println();
        System.out.println();


        System.out.println("// 1.4 Display the array elements in a single line in reversed order, separated by spaces.");
        for (int i = nums.length-1; i >= 0 ; i--) {
            System.out.print(nums[ i]+ " ");

        }
        System.out.println();
        System.out.println();


        System.out.println("// 1.5 Display all evenly divisible elements by 5 in a single line separated by spaces.");
        for (int i = 0; i < nums.length; i++) {
            if( nums[i] % 5 == 0){
                System.out.print(nums[i] + " ");
            }

        }
        System.out.println();


    }
}