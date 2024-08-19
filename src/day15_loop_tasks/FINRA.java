package day15_loop_tasks;

public class FINRA {
    public static void main(String[] args) {

        int finraCount = 0; // FINRA  counter when finra appears
        for (int i = 1; i <= 50 ; i++) { // i is every number from 1 - 100

            boolean divBy3 = i % 3 == 0;
            boolean divBy5 = i % 5 == 0;

            String result = "";


            if( divBy3 && divBy5){
                result = "FINRA";
                finraCount++; // increment FINRA counter

            } else if (divBy3) {
                result = "FIN";

            }else if (divBy5){
                result = "RA";
            }else{
                result = "" + i;
            }

            System.out.print(result + " ");
        }
        System.out.println();
        System.out.println("FINRA count: " + finraCount);



    }
}
