package DebuggingExercises;// User selects pizza topping and sees price

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class DebugFourteen3 extends JFrame implements ItemListener {
    private JComboBox<String> pizzaBox = new JComboBox<>();
    private JTextField totPrice = new JTextField(10);
    private int[] pizzaPrice = {7, 10, 10, 8, 8, 8, 8};

    private DebugFourteen3() {
        super("Pizza List");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        FlowLayout flow = new FlowLayout();
        setLayout(flow);
        pizzaBox.addItemListener(this);
        JLabel aLabel = new JLabel("Paulos's American Pie");
        JLabel toppingList = new JLabel("Topping List");
        add(aLabel);
        add(toppingList);
        add(pizzaBox);
        pizzaBox.addItem("cheese");
        pizzaBox.addItem("sausage");
        pizzaBox.addItem("pepperoni");
        pizzaBox.addItem("onion");
        pizzaBox.addItem("green pepper");
        pizzaBox.addItem("green olive");
        pizzaBox.addItem("black olive");
        add(totPrice);
    }

    public static void main(String[] arguments) {
        JFrame frame = new DebugFourteen3();
        frame.setSize(220, 220);
        frame.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        int source = pizzaBox.getSelectedIndex();
        int totalPrice = pizzaPrice[source];

        String output = "Pizza Price $" + totalPrice;
        totPrice.setText(output);
    }

}
