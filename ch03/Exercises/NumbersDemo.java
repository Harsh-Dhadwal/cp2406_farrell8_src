package Exercises;

public class NumbersDemo
{

    public static void main(String[] args)
    {
        int numOne = 2;
        int numTwo = 3;

        displayTwiceTheNumber(numOne);
        displayTwiceTheNumber(numTwo);

        displayNumberPlusFive(numOne);
        displayNumberPlusFive(numTwo);

        displayNumberSquared(numOne);
        displayNumberSquared(numTwo);

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
