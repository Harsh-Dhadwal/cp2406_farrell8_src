package PracExercises;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class JMovieFrame extends JFrame implements ActionListener{
    private JLabel label = new JLabel();
    private JButton btn1 = new JButton("East");
    private JButton btn2 = new JButton("West");
    private JButton btn3 = new JButton("North");
    private JButton btn4 = new JButton("South");

    private JMovieFrame(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container con = getContentPane();
        con.setLayout(new BorderLayout());

        label.setPreferredSize(new Dimension(200, 100));
        label.setHorizontalAlignment(SwingConstants.CENTER);

        con.add(label, BorderLayout.CENTER);
        con.add(btn1, BorderLayout.EAST);
        con.add(btn2, BorderLayout.WEST);
        con.add(btn3, BorderLayout.NORTH);
        con.add(btn4, BorderLayout.SOUTH);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        setSize(400, 300);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == btn1) {
            System.out.println("a");
            label.setText("Year: year1, Star: star of east");
        } else if (source == btn2) {
            label.setText("Year: year2, Star: star of west");
        } else if (source == btn3) {
            label.setText("Year: year3, Star: star of north");
        } else if (source == btn4) {
            label.setText("Year: year4, Star: star of south");
        }
    }

    public static void main(String[] args) {
        JMovieFrame frame = new JMovieFrame();
        frame.setVisible(true);
    }
}
