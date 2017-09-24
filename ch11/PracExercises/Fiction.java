package PracExercises;

public class Fiction extends Book{
    Fiction(String name){
        super(name);
        setPrice();
    }

    public void setPrice(){
        super.price = 24.99;
    }
}
