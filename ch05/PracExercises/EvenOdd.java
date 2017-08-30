/*
ask user for an integer
Display if the integer is even or odd
*/
package PracExercises;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        int num;
        String output;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number >> ");
        num = input.nextInt();

        if (num % 2 == 0){
            output = num + " is an even number";
        } else {
            output = num + " is an odd number";
        }

        System.out.println(output);
    }
}
