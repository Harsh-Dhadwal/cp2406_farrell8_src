package PracExercises;

public class SedimentaryRock extends Rock {
    public SedimentaryRock(int noOfSamples, double weight){
        super(noOfSamples, weight);
        Rock.description = "Sedimentary Rocks are formed by the deposition and subsequent cementation of that material at the Earth's surface and within bodies of water.";
    }
}
