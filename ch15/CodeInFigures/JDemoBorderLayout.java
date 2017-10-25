package CodeInFigures;

import javax.swing.*;
import java.awt.*;
class JDemoBorderLayout extends JFrame
{

    private JDemoBorderLayout()
   {
       Container con = getContentPane();
       con.setLayout(new BorderLayout());
       JButton nb = new JButton("North Button");
       con.add(nb, BorderLayout.NORTH);
       JButton sb = new JButton("South Button");
       con.add(sb, BorderLayout.SOUTH);
       JButton eb = new JButton("East Button");
       con.add(eb, BorderLayout.EAST);
       JButton wb = new JButton("West Button");
       con.add(wb, BorderLayout.WEST);
       JButton cb = new JButton("Center Button");
       con.add(cb, BorderLayout.CENTER);
      setSize(400, 150);
   }
   public static void main(String[] args)
   {
      JDemoBorderLayout frame = new JDemoBorderLayout();
      frame.setVisible(true);
   }
}
