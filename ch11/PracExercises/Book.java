package PracExercises;

public abstract class Book {
    private String title;
    double price;

    Book(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public abstract void setPrice();

}
