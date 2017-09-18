package PracExercises;

public class UseBook {
    public static void main(String[] args) {
        Fiction finctionBook = new Fiction("Harry Potter, philosopher's stone");
        NonFiction nonFictionBook = new NonFiction("The Brain that changes itself");

        System.out.println("Fiction Book:");
        System.out.println(finctionBook.getTitle() + " for $" + finctionBook.getPrice() + "\n");

        System.out.println("NonFiction Book:");
        System.out.println(nonFictionBook.getTitle() + " for $" + nonFictionBook.getPrice());
    }
}
