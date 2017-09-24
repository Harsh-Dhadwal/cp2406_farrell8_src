package PracExercises;

public class NonMetalElement extends Element {
    NonMetalElement(String name, String symbol, int atomicNum, double atomicWeight) {
        super(name, symbol, atomicNum, atomicWeight);
    }

    @Override
    public void describeElement() {
        System.out.println("Non-Metal: " + name);
        System.out.println("Symbol: " + symbol);
        System.out.println("Atomic No.: " + atomicNum);
        System.out.println("Atomic Weight: " + atomicWeight);
        System.out.println("Properties of Metals:");
        System.out.println("1. " + name + " is a good conductor.");
        System.out.println("2. " + name + " is sonorous.\n");

    }
}
