package day16_nestedLoop;

import com.sun.security.jgss.GSSUtil;

public class Triangle {
    public static void main(String[] args) {
        /*
           j=0
        i=0 *
        i=1 * *
        i=2 * * *
        i=2 * * * *
        i=4 * * * * *
        i=5 * * * * * *
         */


        for (int i = 0; i < 10; i++) {
            System.out.print("\t\t");
            for (int j = 0; j <= i; j++) {
                // System.out.println(i + " " + j);
                System.out.print("* ");

            }
            System.out.println();

        }

        System.out.println("-------------------------------");

        int n = 5;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i <= n; i++) {
                System.out.print("# ");
            }
            System.out.println();
        }

        System.out.println("INCREASING TRIANGLE_______________________________");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("\t* ");

            }
            System.out.println();
        }

        System.out.println("DECREASING TRIANGLE_________________________________");

        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print("\t* ");

            }
            System.out.println();
        }
    }


}

/*
7. Create a class named Triangle and use a nested loop to display the following shape on the console:

				*
				* *
				* * *
				* * * *
				* * * * *
				* * * * * *
				* * * * * * *
				* * * * * * * *
				* * * * * * * * *
				* * * * * * * * * *
 */
