package PracExercises;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFontSelector  extends JFrame implements ActionListener{

    private JLabel label = new JLabel("Font");
    private JButton btn1 = new JButton("Arial");
    private JButton btn2 = new JButton("Comic Sans");
    private JButton btn3 = new JButton("Tahoma");
    private JButton btn4 = new JButton("Courier");
    private JButton btn5 = new JButton("Calibri");
    private JButton btn6 = new JButton("Font Size");
    private int fontSize = 12;


    private JFontSelector(){
        setLayout(new GridLayout(0,1));

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        label.setHorizontalAlignment(JLabel.CENTER);
        add(label);
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        add(btn6);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);


        setSize(300, 350);
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == btn1)
            label.setFont(new Font("Arial", Font.PLAIN, fontSize));
        else if (source == btn2)
            label.setFont(new Font("Comic Sans MS", Font.PLAIN, fontSize));
        else if (source == btn3)
            label.setFont(new Font("Tahoma", Font.PLAIN, fontSize));
        else if (source == btn4)
            label.setFont(new Font("Cpurier", Font.PLAIN, fontSize));
        else if (source == btn5)
            label.setFont(new Font("Calibri", Font.PLAIN, fontSize));
        else if (source == btn6)
            if (fontSize > 12){
                fontSize = 12;
            } else {
                fontSize = 20;
            }
            label.setFont(label.getFont().deriveFont((float) fontSize));

    }

    public static void main(String[] args) {
        JFontSelector frame = new JFontSelector();
    }
}
