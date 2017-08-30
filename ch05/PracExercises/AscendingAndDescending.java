/*
ask user for three integers.
Display them in ascending and descending order.
 */

package PracExercises;

import java.util.Scanner;

public class AscendingAndDescending {
    public static void main(String[] args) {
        int first, second, third;
        int one, two, three;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer >> ");
        first = input.nextInt();

        System.out.print("Enter second integer >> ");
        second = input.nextInt();

        System.out.print("Enter third integer >> ");
        third = input.nextInt();

        if (first < second && first < third) {
            one = first;
            if (second < third) {
                two = second;
                three = third;
            } else {
                two = third;
                three = second;
            }
        } else if (second < first && second < third) {
            one = second;
                if (first < third){
                    two = first;
                    three = third;
                } else {
                    two = third;
                    three = first;
                }
        } else {
            one = third;
            if (first < second){
                two = first;
                three = second;
            } else {
                two = second;
                three = first;
            }
        }

        System.out.println("Ascending >> " + one + " " + two + " " + three);
        System.out.println("Descending >> " + three + " " + two + " " + one);

    }


}
