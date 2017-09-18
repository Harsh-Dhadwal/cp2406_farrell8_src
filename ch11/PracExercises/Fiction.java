package PracExercises;

public class Fiction extends Book{
    public Fiction(String name){
        super(name);
        setPrice();
    }

    public void setPrice(){
        super.price = 24.99;
    }
}
