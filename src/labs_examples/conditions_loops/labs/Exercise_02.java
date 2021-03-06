package labs_examples.conditions_loops.labs;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 *      to accomplish this task.
 * 
 *      Bonus Tricky Challenge: Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert a number between 1 and 7: ");
        int dayNum = scanner.nextInt();

        if (dayNum >0 & dayNum < 8) {
            if (dayNum == 1) {
                System.out.println("Monday");
            } else if (dayNum == 2) {
                System.out.println("Tuesday");
            } else if (dayNum == 3) {
                System.out.println("Wednesday");
            } else if (dayNum == 4) {
                System.out.println("Thursday");
            } else if (dayNum == 5) {
                System.out.println("Friday");
            } else if (dayNum == 6) {
                System.out.println("Saturday");
            } else if (dayNum == 7) {
                System.out.println("Saturday");
            }
        } else {
            System.out.println("Wrong number. Please insert a number between 1 and 7: ");
        }

        // 1) create scanner (don't forget to import Scanner!)
        // 2) prompt user
        // 3) assign input to variable as int
        // 4) write completed code here

    }
}
