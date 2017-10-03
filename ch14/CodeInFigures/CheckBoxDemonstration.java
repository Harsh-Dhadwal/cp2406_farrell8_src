package CodeInFigures;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class CheckBoxDemonstration extends JFrame implements ItemListener
{
   FlowLayout flow = new FlowLayout();

    private CheckBoxDemonstration()
   {
      super("CheckBox Demonstration");
      setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      setLayout(new FlowLayout());
       JLabel label = new JLabel("What would you like to drink?");
       label.setFont(new Font("Arial", Font.ITALIC, 22));
       JCheckBox coffee = new JCheckBox("Coffee", false);
       coffee.addItemListener(this);
       JCheckBox cola = new JCheckBox("Cola", false);
       cola.addItemListener(this);
       JCheckBox milk = new JCheckBox("Milk", false);
       milk.addItemListener(this);
       JCheckBox water = new JCheckBox("Water", false);
       water.addItemListener(this);
      add(label);
      add(coffee);
      add(cola);
      add(milk);
      add(water);
  }
  public void itemStateChanged(ItemEvent check)
  {
      // Actions based on choice go here
  }
  public static void main(String[] arguments)
  {
      final int FRAME_WIDTH = 350;
      final int FRAME_HEIGHT = 120;
      CheckBoxDemonstration frame =
         new CheckBoxDemonstration();
      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setVisible(true);
  }
}
