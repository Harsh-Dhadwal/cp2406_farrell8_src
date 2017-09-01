package PracExercises;

import java.util.Scanner;

public class CountByAnything {
    public static void main(String[] args) {
        int number = 0;
        int stop = 300;
        int countBy;
        int counter = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter value to count by: ");
        countBy = input.nextInt();

        int totalCounts = stop/countBy;

        for (int i = 1; i <= totalCounts; i++){
            number = number + countBy;

            if (counter == 10){
                counter = 0;
                System.out.println("\n");
                System.out.print(number + ", ");
            }
            else {
                System.out.print(number + ", ");
            }
            counter++;
        }
    }
}
