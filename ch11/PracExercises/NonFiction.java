package PracExercises;

public class NonFiction extends Book{
    public NonFiction(String name){
        super(name);
        setPrice();
    }

    public void setPrice(){
        super.price = 37.99;
    }
}
