package PracExercises.src;
import javax.swing.JOptionPane;

public class QuartsToGallonsInteractive {
    public static void main(String[] args) {
        String quartsNeededInput;
        int quartsInGallon = 4;
        quartsNeededInput = JOptionPane.showInputDialog(null, "Enter the number of quarts needed:", "Quarts Needed", JOptionPane.INFORMATION_MESSAGE);
        int gallonsNeeded = (int)Float.parseFloat(quartsNeededInput);
        float quartsNeeded = Float.parseFloat(quartsNeededInput) % quartsInGallon;
        JOptionPane.showMessageDialog(null, "A job that needs " + quartsNeededInput +
                " quarts requires " + (gallonsNeeded / quartsInGallon) +
                " gallons plus " + quartsNeeded + " quarts");
    }
}
