package day12_customMethods;

public class EligibleToVote {

    public static void main(String[] args) {

        eligibleToVote(21, true);
        eligibleToVote(12, false);
        eligibleToVote(18, false);

    }
    public static void eligibleToVote( int age, boolean isAmerican){

        if(age >= 18 && isAmerican){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }

    }
}
