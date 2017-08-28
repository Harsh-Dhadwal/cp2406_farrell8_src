package PracExercises.src;
import java.util.Scanner;

public class QuartsToGallons {
    public static void main(String[] args) {
        int quartsInGallon = 4;
        String userInput;
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Please enter quarts needed >> ");
        userInput = inputDevice.nextLine();
        float quartsNeeded = Float.parseFloat(userInput);
        int gallonsNeeded = (int)Float.parseFloat(userInput)/quartsInGallon;
        System.out.println("A job that needs " + quartsNeeded +
                " quarts requires " + gallonsNeeded +
        " gallons plus " + (quartsNeeded % quartsInGallon) + " quarts");
    }
}
