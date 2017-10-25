package PracExercises;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class JLeftOrRight extends JFrame implements MouseListener {
    JLabel label = new JLabel();
    JLeftOrRight() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 400);
        label.setHorizontalAlignment(JLabel.CENTER);
        add(label);
        addMouseListener(this);
        setVisible(true);
    }

    public static void main(String[] args) {
        JLeftOrRight frame = new JLeftOrRight();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int click = e.getModifiers();
        if (click == 16){
            label.setText("Left Click");
        } else if (click == 8){
            label.setText("Middle Click");
        } else if (click == 4){
            label.setText("Right Click");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
