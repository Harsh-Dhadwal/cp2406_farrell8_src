package DebuggingExercises;// Displays list of payment options
//      - credit card, check or cash
// Displays fee for using each - 5%, 2% or 0%

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class DebugFourteen2 extends JFrame implements ItemListener {
    private JComboBox<String> payMethod = new JComboBox<>();
    private JTextField totFees = new JTextField(25);
    private int[] fees = {5, 2, 0};

    private DebugFourteen2() {
        super("Pay List");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        FlowLayout flow = new FlowLayout();
        setLayout(flow);
        payMethod.addItemListener(this);
        JLabel payList = new JLabel("Pay List");
        add(payList);
        add(payMethod);
        payMethod.addItem("Credit card");
        payMethod.addItem("Check");
        payMethod.addItem("Cash");
        add(totFees);
    }

    public static void main(String[] arguments) {
        JFrame cframe = new DebugFourteen2();
        cframe.setSize(350, 150);
        cframe.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent check) {
        int source = payMethod.getSelectedIndex();
        int feePct = fees[source];

        String pctMsg = "per cent will be added to your bill";
        String output = feePct + " " + pctMsg;
        totFees.setText(output);
    }
}
