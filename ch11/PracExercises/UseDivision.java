package PracExercises;

public class UseDivision {
    public static void main(String[] args) {
        String company1 = "DC";
        String company2 = "Marvel";

        DomesticDivision domDivDC = new DomesticDivision(
                "Cali",
                "California",
                77898);

        InternationalDivision intDivDC = new InternationalDivision(
                "Toki",
                "Japan",
                "Japanese",
                78979);

        DomesticDivision domDivMarvel = new DomesticDivision(
                "NY",
                "New York",
                93244);

        InternationalDivision intDivMarvel = new InternationalDivision(
                "BigBen",
                "England",
                "English",
                98653);

        System.out.println("Company: " + company1);
        System.out.println("Domestic Division:");
        domDivDC.display();
        System.out.println("\nDomestic International:");
        intDivDC.display();

        System.out.println("\nCompany: " + company2);
        System.out.println("Domestic Division:");
        domDivMarvel.display();
        System.out.println("\nDomestic International:");
        intDivMarvel.display();

    }
}
