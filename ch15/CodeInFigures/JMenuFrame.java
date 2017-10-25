package CodeInFigures;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

class JMenuFrame extends JFrame implements
        ActionListener {
    private JMenuItem exit = new JMenuItem("Exit");
    private JMenuItem dark = new JMenuItem("Dark");
    private JMenuItem white = new JMenuItem("White");
    private JMenuItem pink = new JMenuItem("Pink");

    private JMenuFrame() {
        setLayout(new FlowLayout());
        JMenuBar mainBar = new JMenuBar();
        setJMenuBar(mainBar);
        JMenu menu1 = new JMenu("File");
        mainBar.add(menu1);
        JMenu menu2 = new JMenu("Colors");
        mainBar.add(menu2);
        menu1.add(exit);
        JMenu bright = new JMenu("Bright");
        menu2.add(bright);
        menu2.add(dark);
        menu2.add(white);
        bright.add(pink);
        JMenuItem yellow = new JMenuItem("Yellow");
        bright.add(yellow);
        exit.addActionListener(this);
        dark.addActionListener(this);
        white.addActionListener(this);
        pink.addActionListener(this);
        yellow.addActionListener(this);
        JLabel label = new JLabel("Hello");
        add(label);
        label.setFont(new Font("Arial", Font.BOLD, 26));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        Container con = getContentPane();
        if (source == exit)
            System.exit(0);
        else if (source == dark)
            con.setBackground(Color.BLACK);
        else if (source == white)
            con.setBackground(Color.WHITE);
        else if (source == pink)
            con.setBackground(Color.PINK);
        else con.setBackground(Color.YELLOW);
    }

    public static void main(String[] args) {
        JMenuFrame mFrame = new JMenuFrame();
        final int WIDTH = 250;
        final int HEIGHT = 200;
        mFrame.setSize(WIDTH, HEIGHT);
        mFrame.setVisible(true);
    }
}
