package PracExercises;

public class MetamorphicRock extends Rock {
    public MetamorphicRock(int noOfSamples, double weight){
        super(noOfSamples, weight);
        Rock.description = "Metamorphic Rocks are formed from the transformation of existing rock types, in a process called metamorphism";
    }
}
