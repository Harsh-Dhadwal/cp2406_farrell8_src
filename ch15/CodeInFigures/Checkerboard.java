package CodeInFigures;

import javax.swing.*;
import java.awt.*;

class Checkerboard extends JFrame
{
   private final int ROWS = 8;
   private final int COLS = 8;

    private Checkerboard()
   {
       int GAP = 2;
       JPanel pane = new JPanel
              (new GridLayout(ROWS, COLS, GAP, GAP));
      add(pane);
      int x;
       int NUM = ROWS * COLS;
       for(x = 0; x < NUM; ++x)
      {
         JPanel[] panel = new JPanel[NUM];
         panel[x] = new JPanel();
         pane.add(panel[x]);
         Color color2 = Color.BLUE;
         Color color1 = Color.WHITE;
         if(x % COLS == 0)
         {
            Color tempColor = color1;
            color1 = color2;
            color2 = tempColor;
         }
         if(x % 2 == 0)
            panel[x].setBackground(color1);
         else
            panel[x].setBackground(color2);
      }
   }
   public static void main(String[] args)
   {
      Checkerboard frame = new Checkerboard();
      final int SIZE = 300;
      frame.setSize(SIZE, SIZE);
      frame.setVisible(true);
   }
}
