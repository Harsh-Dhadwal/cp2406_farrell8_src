package DebuggingExercises;// Demonstrates layout positions
// using BorderLayout
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class DebugFifteen2 extends JFrame
{

    private DebugFifteen2()
   {
       Container con = this.getContentPane();
      con.setLayout(new BorderLayout());
       JButton nb = new JButton("Left");
       con.add(nb, BorderLayout.NORTH);
       JButton sb = new JButton("Down");
       con.add(sb, BorderLayout.SOUTH);
       JButton eb = new JButton("Right");
       con.add(eb, BorderLayout.EAST);
       JButton wb = new JButton("Center");
       con.add(wb, BorderLayout.WEST);
       JButton cb = new JButton("Up");
       con.add(cb, BorderLayout.CENTER);
   }
   public static void main(String[] args)
   {
      DebugFifteen2 f = new DebugFifteen2();
      f.setSize(300, 300);
      f.setVisible(true);
   }
}
