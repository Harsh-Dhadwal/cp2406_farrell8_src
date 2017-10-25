package CodeInFigures;

import java.awt.*;
import java.awt.Color;
import javax.swing.*;
class JFrameWithColor extends JFrame
{

   private JFrameWithColor()
   {
      int SIZE = 180;
      setSize(SIZE, SIZE);
      setVisible(true);
      Container con = getContentPane();
      con.setLayout(new FlowLayout());
      JButton button = new JButton("Press Me");
      con.add(button);
      con.setBackground(Color.YELLOW);
      button.setBackground(Color.RED);
      button.setForeground(Color.WHITE);
   }
   public static void main(String[] args)
   {
      JFrameWithColor frame = new JFrameWithColor();
      frame.setVisible(true);
   }
}
