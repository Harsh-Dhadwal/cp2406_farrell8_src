package Exercises;

import java.util.Scanner;

public class NumbersDemo2
{

    public static void main(String[] args)
    {
        int numOne = getNumber("first");
        int numTwo = getNumber("second");

        displayTwiceTheNumber(numOne);
        displayTwiceTheNumber(numTwo);

        displayNumberPlusFive(numOne);
        displayNumberPlusFive(numTwo);

        displayNumberSquared(numOne);
        displayNumberSquared(numTwo);

    }

    private static int getNumber(String name)
    {
        int number;
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter " + name + " number >> ");
        number = input.nextInt();
        return number;
    }

    private static void displayTwiceTheNumber(int number)
    {
        System.out.println(number + " twice is " + (number * 2));
    }

    private static void displayNumberPlusFive(int number)
    {
        System.out.println(number + " + 5 is " + (number + 5));
    }

    private static void displayNumberSquared(int number)
    {
        System.out.println(number + " squared is " + (number * number));
    }
}
