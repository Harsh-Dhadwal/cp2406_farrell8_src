package PracExercises;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JPizza extends JFrame implements ItemListener {
    Font bigFont = new Font("Arial", Font.PLAIN, 24);
    private JLabel size = new JLabel("Size : ");
    private JCheckBox sizeS = new JCheckBox("Small ($7)", false);
    private JCheckBox sizeM = new JCheckBox("Medium ($9)", false);
    private JCheckBox sizeL = new JCheckBox("Large ($11)", false);
    private JCheckBox sizeE = new JCheckBox("Extra Large ($14)", false);
    private JLabel top = new JLabel("Toppings : ");
    private JCheckBox top1 = new JCheckBox("Cheese", false);
    private JCheckBox top2 = new JCheckBox("Chili", false);
    private JCheckBox top3 = new JCheckBox("Onions", false);
    private JCheckBox top4 = new JCheckBox("Bacon", false);
    private JCheckBox top5 = new JCheckBox("Ham", false);
    private JTextField totPrice = new JTextField(10);
    static int totalPrice = 0;
    ButtonGroup sizeGrp = new ButtonGroup();
    ButtonGroup topGrp = new ButtonGroup();

    private JPizza() {
        super("Beverage Selector");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        FlowLayout flow = new FlowLayout();
        setLayout(flow);
        add(size);
        add(sizeS);
        sizeS.addItemListener(this);
        add(sizeL);
        sizeL.addItemListener(this);
        add(sizeM);
        sizeM.addItemListener(this);
        add(sizeE);
        sizeE.addItemListener(this);
        add(top);
        add(top1);
        top1.addItemListener(this);
        add(top2);
        top2.addItemListener(this);
        add(top3);
        top3.addItemListener(this);
        add(top4);
        top4.addItemListener(this);
        add(top5);
        top5.addItemListener(this);
        add(totPrice);


        sizeGrp.add(sizeS);
        sizeGrp.add(sizeM);
        sizeGrp.add(sizeL);
        sizeGrp.add(sizeE);


        topGrp.add(top1);
        topGrp.add(top2);
        topGrp.add(top3);
        topGrp.add(top4);
        topGrp.add(top5);

        totPrice.setText("0");
    }

    public static void main(String[] arguments) {
        JFrame bFrame = new JPizza();
        bFrame.setSize(520, 100);
        bFrame.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent check) {
        Object size = check.getItem();
        if (size == sizeS) {
            totalPrice = 7;
        } else if (size == sizeM){
            totalPrice = 9;
        } else if (size == sizeL){
            totalPrice = 11;
        } else if (size == sizeE) {
            totalPrice = 14;
        }
        Object top = check.getItem();
        int topCost;
        if (top == top2 || top == top3 || top == top4) {
            topCost = 1;
        } else {
            topCost = 0;
        }

        totPrice.setText("$" + (totalPrice + topCost));
    }
}