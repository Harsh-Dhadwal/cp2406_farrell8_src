package PracExercises;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    MyPanel(Color back, Color front, Font font, String label){
        setBackground(back);
        Label text = new Label(label);
        text.setForeground(front);
        text.setFont(font);
        add(text);
    }
}
