package PracExercises;

public class InternationalDivision extends Division{
    private String country, language;

    InternationalDivision(String name, String country, String language, int accountNum){
        super(name, accountNum);
        this.country = country;
        this.language = language;
    }

    @Override
    void display() {
        System.out.println("International Division " + name + " >>");
        System.out.println("County: " + country);
        System.out.println("Language: " + language);
        System.out.println("Account No.: " + accountNum);
    }
}
