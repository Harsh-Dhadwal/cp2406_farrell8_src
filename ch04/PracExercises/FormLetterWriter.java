package PracExercises;

public class FormLetterWriter {


    public void displaySalutation(String lastName)
    {
        System.out.println("Dear Mr. or Mrs. " + lastName + " thank you for your recent order.");
    }

    public void displaySalutation(String firstName, String lastName)
    {
        System.out.println("Dear " + firstName + " " + lastName + " thank you for your recent order.");
    }
}
