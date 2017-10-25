package CodeInFigures;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JMenuFrame2 extends JFrame {

    private JMenuFrame2() {
        setLayout(new FlowLayout());
        JMenuBar mainBar = new JMenuBar();
        setJMenuBar(mainBar);
        JMenu menu1 = new JMenu("File");
        mainBar.add(menu1);
        JCheckBoxMenuItem check1 = new
                JCheckBoxMenuItem("Check box A");
        menu1.add(check1);
        JCheckBoxMenuItem check2 = new
                JCheckBoxMenuItem("Check box B");
        menu1.add(check2);
        menu1.addSeparator();
        JRadioButtonMenuItem radio1 = new
                JRadioButtonMenuItem("Radio option 1");
        menu1.add(radio1);
        JRadioButtonMenuItem radio2 = new
                JRadioButtonMenuItem("Radio option 2");
        menu1.add(radio2);
        JRadioButtonMenuItem radio3 = new
                JRadioButtonMenuItem("Radio option 3");
        menu1.add(radio3);
        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        group.add(radio3);
    }

    public static void main(String[] args) {
        JMenuFrame2 frame = new JMenuFrame2();
        final int WIDTH = 150;
        final int HEIGHT = 200;
        frame.setSize(WIDTH, HEIGHT);
        frame.setVisible(true);
    }
}
