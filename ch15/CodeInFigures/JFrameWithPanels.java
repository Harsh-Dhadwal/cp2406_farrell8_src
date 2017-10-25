package CodeInFigures;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
class JFrameWithPanels extends JFrame
{

    private JFrameWithPanels()
   {
      JPanel panel1 = new JPanel();
      JPanel panel2 = new JPanel();
      Container con = getContentPane();
      con.setLayout(new FlowLayout());
      con.add(panel1);
      con.add(panel2);
       JButton button1 = new JButton("One");
       panel1.add(button1);
      panel1.setBackground(Color.BLUE);
       JButton button2 = new JButton("Two");
       panel2.add(button2);
       JButton button3 = new JButton("Three");
       panel2.add(button3);
      panel2.setBackground(Color.BLUE);
       int HEIGHT = 120;
       int WIDTH = 250;
       setSize(WIDTH, HEIGHT);
   }
   public static void main(String[] args)
   {
      JFrameWithPanels frame = new JFrameWithPanels();
      frame.setVisible(true);

   }
}
