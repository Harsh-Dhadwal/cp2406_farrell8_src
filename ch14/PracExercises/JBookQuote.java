package PracExercises;

import javax.swing.*;
import java.awt.*;

public class JBookQuote {
    public static void main(String[] args) {
        final int FRAME_WIDTH = 250;
        final int FRAME_HEIGHT =  200;
        JFrame aFrame = new JFrame("Book Quote");
        aFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        aFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        aFrame.setVisible(true);
        JLabel msg1 = new JLabel("a quote from a book.");
        JLabel msg2 = new JLabel("write any quote you like.");
        aFrame.setLayout(new FlowLayout());
        aFrame.add(msg1);
        aFrame.add(msg2);
    }
}
