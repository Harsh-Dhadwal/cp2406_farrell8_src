package PracExercises;

public class IgneousRock extends Rock{
    public IgneousRock(int noOfSamples, double weight){
        super(noOfSamples, weight);
        Rock.description = "Igneous Rocks are formed through the cooling and solidification of magma or lava.";
    }
}
