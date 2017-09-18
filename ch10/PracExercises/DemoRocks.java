package PracExercises;

public class DemoRocks {
    public static void main(String[] args) {
        IgneousRock rock1 = new IgneousRock(2, 250);
        SedimentaryRock rock2 = new SedimentaryRock(3, 300);
        MetamorphicRock rock3 = new MetamorphicRock(1, 500);

        System.out.println(rock1.getDescription());
        System.out.println("No. of samples: " + rock1.getNoOfSamples());
        System.out.println("Weight: " + rock2.getWeight());

        System.out.println("\n" + rock2.getDescription());
        System.out.println("No. of samples: " + rock2.getNoOfSamples());
        System.out.println("Weight: " + rock2.getWeight());

        System.out.println("\n" + rock3.getDescription());
        System.out.println("No. of samples: " + rock3.getNoOfSamples());
        System.out.println("Weight: " + rock3.getWeight());
    }
}
