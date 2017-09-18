package PracExercises;

public class DemoPoems {
    public static void main(String[] args) {
        Couplet couplet = new Couplet("Shakespeare");

        System.out.println("Couplet: " + couplet.getName());
        System.out.println("Lines: " + couplet.getLines());

        Limerick limerick = new Limerick("Old man");

        System.out.println("Limerick: " + limerick.getName());
        System.out.println("Lines: " + limerick.getLines());

        Haiku haiku = new Haiku("Matsuo Basho");

        System.out.println("Haiku: " + haiku.getName());
        System.out.println("Lines: " + haiku.getLines());
    }
}
