package CodeInFigures;

import javax.swing.*;
import java.awt.*;
class JScrollDemo extends JFrame
{

    private JScrollDemo()
   {
      super("JScrollDemo");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       Container con = getContentPane();
       Font bigFont = new Font("Arial", Font.PLAIN, 20);
       JLabel label = new JLabel("Four score and seven");
       label.setFont(bigFont);
       JPanel panel = new JPanel();
       JScrollPane scroll = new JScrollPane(panel,
               ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
               ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
       con.add(scroll);
      panel.add(label);       
   }
   public static void main(String[] args)
   {
      final int WIDTH = 180;
      final int HEIGHT = 100;
      JScrollDemo aFrame = new JScrollDemo();
      aFrame.setSize(WIDTH, HEIGHT);
      aFrame.setVisible(true);
   }
}
