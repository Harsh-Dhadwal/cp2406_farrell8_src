package PracExercises;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JBookQuote2{
    public static void main(String[] args) {
        final int FRAME_WIDTH = 200;
        final int FRAME_HEIGHT =  200;
        JFrame aFrame = new JFrame("Book Quote");
        aFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        aFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        aFrame.setVisible(true);
        JLabel msg1 = new JLabel("a quote from a book.");
        JLabel msg2 = new JLabel("write any quote you like.");
        JLabel bookName = new JLabel("Book Name");
        JButton button = new JButton("Book");
        button.setEnabled(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean bookNameToggle = bookName.isVisible();
                bookNameToggle = !bookNameToggle;
                bookName.setVisible(bookNameToggle);
            }
        });
        aFrame.setLayout(new FlowLayout());
        aFrame.add(bookName);
        aFrame.add(msg1);
        aFrame.add(msg2);
        aFrame.add(button);

    }


}
