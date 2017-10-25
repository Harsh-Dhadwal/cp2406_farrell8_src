package CodeInFigures;

import javax.swing.*;
import java.awt.*;
class JDemoManyPanels extends JFrame
{

    private JDemoManyPanels()
   {
      setLayout(new BorderLayout());
       JPanel panel01 = new JPanel(new GridLayout(2, 0));
       add(panel01, BorderLayout.WEST);
       JPanel panel02 = new JPanel(new FlowLayout());
       add(panel02, BorderLayout.CENTER);
       JPanel panel03 = new JPanel(new FlowLayout());
       add(panel03, BorderLayout.SOUTH);
       JPanel panel04 = new JPanel(new GridLayout(2, 0));
       add(panel04, BorderLayout.EAST);

       JButton button01 = new JButton("One");
       panel01.add(button01);
       JButton button02 = new JButton("Two");
       panel01.add(button02);
       JButton button03 = new JButton("Three");
       panel01.add(button03);

       JButton button04 = new JButton("Four");
       panel02.add(button04);
       JButton button05 = new JButton("Five");
       panel02.add(button05);
       JButton button06 = new JButton("Six");
       panel02.add(button06);

       JButton button07 = new JButton("Seven");
       panel03.add(button07);

       JButton button08 = new JButton("Eight");
       panel04.add(button08);
       JButton button09 = new JButton("Nine");
       panel04.add(button09);
       JButton button10 = new JButton("Ten");
       panel04.add(button10);
       JButton button11 = new JButton("Eleven");
       panel04.add(button11);
       JButton button12 = new JButton("Twelve");
       panel04.add(button12);

      setSize(400, 250);
   }
   public static void main(String[] args)
   {
      JDemoManyPanels frame = new JDemoManyPanels();
      frame.setVisible(true);
   }
}
