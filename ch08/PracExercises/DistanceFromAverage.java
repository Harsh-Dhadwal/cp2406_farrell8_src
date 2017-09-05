package PracExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DistanceFromAverage {
    public static void main(String[] args) {
        List<Integer> intArray = new ArrayList<>();
        int total = 0;
        float avg;

        boolean quit = false;

        while (!quit){
            System.out.println("Enter numbers between 10 and 20. Enter 99999 to quit.");
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number >>> ");
            int userInput = input.nextInt();

            if (userInput >= 10 && userInput <= 20) {
                intArray.add(userInput);
                total += userInput;
            }
            else if (userInput == 99999) {
                if (intArray.size() <= 0){
                    System.out.println("No numbers entered. Good Bye!");
                }
                quit = true;
            }
            else {
                System.out.println("Invalid number!!!!!");
            }
        }

        avg = (float) total/intArray.size();

        for (int num : intArray) {
            System.out.printf(
                    "%d is %.2f away from average, %.2f\n",
                    num, num - avg, avg );
        }
    }
}
