package PracExercises;

public class DomesticDivision extends Division{
    private String state;

    DomesticDivision(String name, String state, int accountNum){
        super(name, accountNum);
        this.state = state;
    }

    @Override
    void display() {
        System.out.println("Domestic Division " + name + " >>");
        System.out.println("State: " + state);
        System.out.println("Account No.: " + accountNum);
    }
}
