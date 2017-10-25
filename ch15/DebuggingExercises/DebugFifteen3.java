package DebuggingExercises;// Lets user type keys
// Displays each key typed

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class DebugFifteen3 extends JFrame implements KeyListener {
    private JLabel label = new JLabel("Key Typed:");


    private DebugFifteen3() {
        label.setHorizontalAlignment(SwingConstants.CENTER);
        setTitle("Debug Key Frame");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JTextField textArea = new JTextField(10);
        textArea.setPreferredSize(new Dimension(300, 80));
        add(textArea, BorderLayout.SOUTH);

        add(label, BorderLayout.NORTH);
        addKeyListener(this);
        textArea.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        label.setText("Key Typed: " + c);
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    public static void main(String[] args) {
        DebugFifteen3 kFrame = new DebugFifteen3();
        kFrame.setSize(300, 200);
        kFrame.setVisible(true);
    }
}


