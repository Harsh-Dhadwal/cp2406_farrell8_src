package CodeInFigures;

import java.awt.*;
import javax.swing.*;
class JFrameWithExplicitContentPane extends JFrame
{

   private JFrameWithExplicitContentPane()
   {
      int SIZE = 180;
      setSize(SIZE, SIZE);
      Container con = getContentPane();
      con.setLayout(new FlowLayout());
      JButton button = new JButton("Press Me");
      con.add(button);
   }
   public static void main(String[] args)
   {
      JFrameWithExplicitContentPane frame =
         new JFrameWithExplicitContentPane();
      frame.setVisible(true);
   }
}
