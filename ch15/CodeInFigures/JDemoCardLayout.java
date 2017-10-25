package CodeInFigures;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class JDemoCardLayout extends JFrame implements ActionListener
{
   private CardLayout cards = new CardLayout();

   private JDemoCardLayout()
   {
      Container con = getContentPane();
      con.setLayout(cards);
      JButton b1 = new JButton("Ace of Hearts");
      con.add("ace", b1);
      b1.addActionListener(this);
      JButton b2 = new JButton("Three of Spades");
      con.add("three", b2);
      b2.addActionListener(this);
      JButton b3 = new JButton("Queen of Clubs");
      con.add("queen", b3);
      b3.addActionListener(this);
      setSize(200, 100);
   }
   @Override
   public void actionPerformed(ActionEvent e)
   {
      cards.next(getContentPane());
   }
   public static void main(String[] args)
   {
      JDemoCardLayout frame = new JDemoCardLayout();
      frame.setVisible(true);
   }
}
