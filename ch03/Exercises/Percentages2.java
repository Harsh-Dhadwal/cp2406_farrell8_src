package Exercises;

import java.util.Scanner;

public class Percentages2
{
    public static void main(String[] args)
    {
        double numOne = getNumber("first value");
        double numTwo = getNumber("second value");

        computePercent(numOne, numTwo);

        computePercent(numTwo, numOne);
    }

    private static double getNumber(String valueNumber)
    {
        double number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter " + valueNumber + " >> ");
        number = input.nextDouble();
        return number;
    }

    private static void computePercent(double firstNum, double secondNum)
    {
        System.out.printf("%.1f is %.0f percent of %.1f \n", firstNum, (firstNum * 100 / secondNum),secondNum);
    }
}
