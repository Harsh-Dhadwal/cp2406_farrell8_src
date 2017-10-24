package PracExercises;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameDisableButton {
    private static int count = 0;
    public static void main(String[] args) {
        final int FRAME_WIDTH = 200;
        final int FRAME_HEIGHT =  200;
        JFrame aFrame = new JFrame("Disable Button");
        aFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        aFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        aFrame.setVisible(true);
        JLabel msg = new JLabel("Click multiple times to disable");
        JButton button = new JButton("Disable");
        button.setEnabled(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                if (count>8){
                    button.setEnabled(false);
                }
            }
        });
        aFrame.setLayout(new FlowLayout());
        aFrame.add(msg);
        aFrame.add(button);
    }
}
