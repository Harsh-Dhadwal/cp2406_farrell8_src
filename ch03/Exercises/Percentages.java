package Exercises;

public class Percentages
{
    public static void main(String[] args)
    {
        double numOne = 2.0;
        double numTwo = 5.0;

        computePercent(numOne, numTwo);

        computePercent(numTwo, numOne);
    }

    private static void computePercent(double firstNum, double secondNum)
    {
        System.out.printf("%.1f is %.0f percent of %.1f \n", firstNum, (firstNum * 100 / secondNum),secondNum);
    }
}

