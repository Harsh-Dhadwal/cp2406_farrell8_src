package PracExercises;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JHistoricalFacts {
    private static String[] facts = new String[5];
    private static int displayFact = 0;
    public static void main(String[] args) {
        facts[0] = "Intresting fact number 1";
        facts[1] = "Intresting fact number 2";
        facts[2] = "Intresting fact number 3";
        facts[3] = "Intresting fact number 4";
        facts[4] = "Intresting fact number 5";
        final int FRAME_WIDTH = 200;
        final int FRAME_HEIGHT =  200;
        JFrame aFrame = new JFrame("Disable Button");
        aFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        aFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        aFrame.setVisible(true);
        JLabel msg = new JLabel();
        msg.setText(facts[displayFact]);
        JButton button = new JButton("Change");
        button.setEnabled(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayFact++;
                displayFact = displayFact >= 5 ? 0: displayFact;
                msg.setText(facts[displayFact]);
            }
        });
        aFrame.setLayout(new FlowLayout());
        aFrame.add(msg);
        aFrame.add(button);
    }
}
