package CodeInFigures;

import javax.swing.*;
import java.awt.*;
class JDemoGridLayout extends JFrame
{

   private JDemoGridLayout()
   {
      Container con = getContentPane();
      GridLayout layout = new GridLayout(3, 2, 5, 5);
      con.setLayout(layout);
      JButton b1 = new JButton("Button 1");
      con.add(b1);
      JButton b2 = new JButton("Button 2");
      con.add(b2);
      JButton b3 = new JButton("Button 3");
      con.add(b3);
      JButton b4 = new JButton("Button 4");
      con.add(b4);
      JButton b5 = new JButton("Button 5");
      con.add(b5);
      setSize(200, 200);
   }
   public static void main(String[] args)
   {
      JDemoGridLayout frame = new JDemoGridLayout();
      frame.setVisible(true);

   }
}
