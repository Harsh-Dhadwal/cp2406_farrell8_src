package PracExercises;

public abstract class Element {
    String name;
    String symbol;
    int atomicNum;
    double atomicWeight;

    Element (String name, String symbol, int atomicNum, double atomicWeight){
        this.symbol = symbol;
        this.atomicNum = atomicNum;
        this.atomicWeight = atomicWeight;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getAtomicNum() {
        return atomicNum;
    }

    public double getAtomicWeight() {
        return atomicWeight;
    }

    public abstract void describeElement();
}
