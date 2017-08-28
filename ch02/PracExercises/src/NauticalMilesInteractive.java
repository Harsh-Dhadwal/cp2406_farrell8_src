package PracExercises.src;
import javax.swing.JOptionPane;

public class NauticalMilesInteractive {
    public static void main(String[] args) {
        double kmInNm = 1.852;      // Number of kilometers in 1 Nautical mile
        double mInNm = 1.150779;    // Number of miles in 1 Nautical mile
        String userInput = JOptionPane.showInputDialog(
                null,
                "Enter the number of Nautical Miles:",
                "Nautical Miles Converter", JOptionPane.INFORMATION_MESSAGE);
        double nauticalMiles = Double.parseDouble(userInput);   // userinput string to a double
        double nmToKm = nauticalMiles * kmInNm;                 // Nautical miles to kilometers
        double nmToM = nauticalMiles * mInNm;                   // Nautical miles to miles
        JOptionPane.showMessageDialog(
                null,
                "There are " + nmToKm + " kilometers and " + nmToM +
                        " miles in " + nauticalMiles + " nautical miles",
                "Nautical Miles Converter", JOptionPane.INFORMATION_MESSAGE);
    }
}
