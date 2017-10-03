package DebuggingExercises;// Beverage selector
// Milk and cola are $3
// all other drinks are $2

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DebugFourteen4 extends JFrame implements ItemListener {
    Font bigFont = new Font("Arial", Font.PLAIN, 24);
    private JCheckBox cola = new JCheckBox("Cola", false);
    JCheckBox tea = new JCheckBox("Iced tea", false);
    JCheckBox lemon = new JCheckBox("Lemonade", false);
    private JCheckBox milk = new JCheckBox("Milk", false);
    private JTextField totPrice = new JTextField(10);
    String output;
    int totalPrice = 0;

    private DebugFourteen4() {
        super("Beverage Selector");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        FlowLayout flow = new FlowLayout();
        setLayout(flow);
        add(cola);
        cola.addItemListener(this);
        add(lemon);
        lemon.addItemListener(this);
        add(tea);
        tea.addItemListener(this);
        add(milk);
        milk.addItemListener(this);
        add(totPrice);

        ButtonGroup drinkGrp = new ButtonGroup();
        drinkGrp.add(cola);
        drinkGrp.add(lemon);
        drinkGrp.add(milk);
        drinkGrp.add(tea);
        totPrice.setText("0");
    }

    public static void main(String[] arguments) {
        JFrame bFrame = new DebugFourteen4();
        bFrame.setSize(350, 100);
        bFrame.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent check) {
        Object source = check.getItem();
        if (source == cola || source == milk) {
            int HIGH_PRICE = 3;
            totPrice.setText("$" + HIGH_PRICE);
        } else {
            int LOW_PRICE = 2;
            totPrice.setText("$" + LOW_PRICE);
        }
    }
}
