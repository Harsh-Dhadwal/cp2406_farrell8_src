package PracExercises;

abstract class Book {
    private String title;
    double price;

    Book(String title){
        this.title = title;
    }

    String getTitle() {
        return title;
    }

    double getPrice() {
        return price;
    }

    abstract void setPrice();

}
