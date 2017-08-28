package PracExercises.src;
import java.util.Scanner;

public class NauticalMiles {
    public static void main(String[] args) {
        double kmInNm = 1.852;
        double mInNm = 1.150779;
        String userInput;
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Please enter the number of Nautical Miles >> ");
        userInput = inputDevice.nextLine();
        double nauticalMiles = Double.parseDouble(userInput);
        double nmToKm = nauticalMiles * kmInNm;
        double nmToM = nauticalMiles * mInNm;
        System.out.println("There are " + nmToKm
        + " kilometers and " + nmToM +
        " miles in " + nauticalMiles + " nautical miles");
    }
}
