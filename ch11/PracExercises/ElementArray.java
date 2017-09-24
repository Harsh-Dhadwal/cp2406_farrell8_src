package PracExercises;

import java.lang.reflect.Array;

public class ElementArray {
    public static void main(String[] args) {
        Element[] elements = new Element[4];

        elements[0] = new NonMetalElement("Carbon","C", 6, 12.01);
        elements[1] = new NonMetalElement("Nitrogen","N", 7, 14.007);
        elements[2] = new MetalElement("Lithium","Li", 3, 6.94);
        elements[3] = new MetalElement("Magnesium","Mg", 12, 24.305);

        for (Element element: elements){
            element.describeElement();
        }
    }
}
