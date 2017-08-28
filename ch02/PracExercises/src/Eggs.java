package PracExercises.src;
import javax.swing.JOptionPane;

public class Eggs {
    public static void main(String[] args) {
        int priceOfOne = 45;            // price of one egg in cents
        double priceOfDozen = 3.25;     // Price of dozen eggs in $
        double priceOfLoose = (double)priceOfOne/100;     // Price of individual eggs in $

        String userInput = JOptionPane.showInputDialog(
                null,
                "How many eggs would you like:",
                "Egg Basket", JOptionPane.INFORMATION_MESSAGE);

        int noOfEggs = Integer.parseInt(userInput);     // no. of eggs requested by the user
        int noOfDozens = noOfEggs / 12; // number of dozens ordered
        int noOfLoose = noOfEggs % 12;  // number of loose eggs
        double totalPrice; // price of user order
        totalPrice = (noOfDozens * priceOfDozen) + (noOfLoose * priceOfLoose);

        JOptionPane.showMessageDialog(
                null,
                "You ordered " + noOfEggs +
                        " eggs. That's " + noOfDozens +
                        " dozen at $" + priceOfDozen +
                        " per dozen and " + noOfLoose +
                        " loose eggs at " + priceOfOne +
                        " cents each for a total of $" + totalPrice + ".");
    }
}
