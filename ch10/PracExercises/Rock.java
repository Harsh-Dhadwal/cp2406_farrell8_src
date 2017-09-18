package PracExercises;

public class Rock {
    protected static String description = "Unclassified";
    protected int noOfSamples;
    protected double weight;

    public Rock(int noOfSamples, double weight){
        this.noOfSamples = noOfSamples;
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public int getNoOfSamples() {
        return noOfSamples;
    }

    public double getWeight() {
        return weight;
    }
}
