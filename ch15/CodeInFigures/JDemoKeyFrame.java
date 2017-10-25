package CodeInFigures;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JDemoKeyFrame extends JFrame
        implements KeyListener {
    private JLabel outputLabel = new JLabel();

    private JDemoKeyFrame() {
        setLayout(new BorderLayout());
        JLabel prompt = new JLabel("Type keys below:");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(prompt, BorderLayout.NORTH);
        JTextField textField = new JTextField(10);
        add(textField, BorderLayout.CENTER);
        add(outputLabel, BorderLayout.SOUTH);
        addKeyListener(this);
        textField.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        outputLabel.setText("Last key typed: " + c);
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    public static void main(String[] args) {
        JDemoKeyFrame keyFrame = new JDemoKeyFrame();
        final int WIDTH = 250;
        final int HEIGHT = 100;
        keyFrame.setSize(WIDTH, HEIGHT);
        keyFrame.setVisible(true);
    }
}
