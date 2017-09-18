package PracExercises;

public class DemoHorses {
    public static void main(String[] args) {
        Horse myHorse = new Horse();
        RaceHorse myRaceHorse = new RaceHorse();

        myHorse.setName("horsee");
        myHorse.setColor("Brown");
        myHorse.setBirthYear(2010);

        myRaceHorse.setName("Racer");
        myRaceHorse.setColor("White");
        myRaceHorse.setBirthYear(2015);
        myRaceHorse.setRaces(5);



        System.out.println("My Horse: ");
        System.out.println("Name: " + myHorse.getName());
        System.out.println("Color: " + myHorse.getColor());
        System.out.println("Birth year: " + myHorse.getBirthYear());

        System.out.println("\nMy race horse: ");
        System.out.println("Name: " + myRaceHorse.getName());
        System.out.println("Color: " + myRaceHorse.getColor());
        System.out.println("Birth year: " + myRaceHorse.getBirthYear());
        System.out.println("Races: " + myRaceHorse.getRaces());
    }
}
