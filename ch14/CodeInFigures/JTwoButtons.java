package CodeInFigures;

import javax.swing.*;
import java.awt.*;
class JTwoButtons extends JFrame
{

   private JTwoButtons()
   {
      JButton button1 = new JButton("Enabled");
      add(button1);
      JButton button2 = new JButton("Disabled");
      add(button2);
      button2.setEnabled(false);
      setLayout(new FlowLayout());
   }
   public static void main(String[] args)
   {
      JTwoButtons frame = new JTwoButtons();
      frame.setSize(150, 150);
      frame.setVisible(true);
   }
}