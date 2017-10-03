package CodeInFigures;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class JHelloFrame extends JFrame implements ActionListener
{
    private JTextField answer = new JTextField(10);
    private JLabel greeting = new JLabel("");

    public JHelloFrame()
   {
      super("Hello Frame");
       int HEIGHT = 225;
       int WIDTH = 275;
       setSize(WIDTH, HEIGHT);
      setLayout(new FlowLayout());
       Font bigFont = new Font("Arial", Font.BOLD, 16);
       JLabel question = new JLabel("What is your name?");
       question.setFont(bigFont);
      greeting.setFont(bigFont);
      add(question);
      add(answer);
       JButton pressMe = new JButton("Press me");
       add(pressMe);
      add(greeting);
      setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      pressMe.addActionListener(this);
    }
   @Override
   public void actionPerformed(ActionEvent e)
   {
       String name = answer.getText();
       String greet = "Hello, " + name;
       greeting.setText(greet);
   }
}
