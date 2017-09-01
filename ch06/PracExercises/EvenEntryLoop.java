package PracExercises;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EvenEntryLoop {
    public static void main(String[] args) {
        int number;
        final int stop = 999;

        Scanner input = new Scanner(System.in);
        int quit = 0;
        while (quit == 0) {
            System.out.println("Enter an even number >> ");
            number = input.nextInt();

            if ((number % 2) == 0){
                System.out.println("Good job!");
            }
            else if (number == stop){
                quit = 1;
            }
            else {
                System.out.println(number + " is not an even number.");
            }
        }
    }
}
