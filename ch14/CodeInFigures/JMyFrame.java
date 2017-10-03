package CodeInFigures;

import javax.swing.*;
class JMyFrame extends JFrame
{

    public JMyFrame()
   {
      super("My frame");
       int HEIGHT = 120;
       int WIDTH = 200;
       setSize(WIDTH, HEIGHT);
      setVisible(true);
      setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
   }
}
