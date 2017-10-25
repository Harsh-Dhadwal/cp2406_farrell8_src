package PracExercises;

import javax.swing.*;
import java.awt.*;

public class JPanelDemo  extends JFrame{
    private JPanelDemo(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 2));

        MyPanel p1 = new MyPanel(Color.BLUE, Color.RED, new Font("Arial", Font.PLAIN,12), "I am Red");
        MyPanel p2 = new MyPanel(Color.RED, Color.BLUE, new Font("Arial", Font.PLAIN,12), "I am Blue");
        MyPanel p3 = new MyPanel(Color.YELLOW, Color.BLACK, new Font("Arial", Font.PLAIN,12), "I am Black");
        MyPanel p4 = new MyPanel(Color.GREEN, Color.WHITE, new Font("Arial", Font.PLAIN,12), "I am White");

        add(p1);
        add(p2);
        add(p3);
        add(p4);

        setVisible(true);
        setSize(400, 400);
    }

    public static void main(String[] args) {
        JPanelDemo frame = new JPanelDemo();
    }
}
