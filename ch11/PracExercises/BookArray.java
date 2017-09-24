package PracExercises;

import java.util.Random;

public class BookArray {
    public static void main(String[] args) {
        String[] fictionTitles = {
                "Don Quixote by Miguel de Cervantes",
                "In Search of Lost Time by Marcel Proust",
                "Ulysses by James Joyce",
                "The Odyssey by Homer",
                "War and Peace by Leo Tolstoy",
                "Moby Dick by Herman Melville",
                "The Divine Comedy by Dante Alighieri",
                "Hamlet by William Shakespeare",
                "The Adventures of Huckleberry Finn by Mark Twain",
                "The Great Gatsby by F. Scott Fitzgerald"};

        String[] nonFictionTitles = {
                "Bad Blood by Lorna Sage",
                "Eat, Pray, Love by Elizabeth Gilbert",
                "The Power of Less by Leo Babauta",
                "A Brief History of Time by Stephen Hawking",
                "Tuesdays With Morrie by Mitch Albom",
                "I Know Why the Caged Bird Sings by Maya Angelou",
                "A Room of One’s Own by Virginia Woolf",
                "The Second Sex by Simone de Beauvoir",
                "The Prince by Niccolò Machiavelli",
                "Don’t Sweat the Small Stuff by Richard Carlson"};

        int rand1 = randInt(0, 9);

        Book[] bookArray = new Book[10];

        System.out.println("Books for sale: \n");
        for (int i = 0; i < rand1; ++i){
            bookArray[i] = new Fiction(fictionTitles[i]);

            System.out.println(bookArray[i].getTitle() + " for $" + bookArray[i].getPrice());
        }

        for (int j = rand1; j < bookArray.length; ++j){
            bookArray[j] = new NonFiction(nonFictionTitles[j - rand1]);

            System.out.println(bookArray[j].getTitle() + " for $" + bookArray[j].getPrice());
        }

    }

    public static int randInt(int min, int max){
        int rInt = min + (int)(Math.random() * (max + 1));
        return rInt;
    }

    public static int randInt2(int min, int max){
        Random random = new Random();
        int rInt = random.nextInt((max-min)) + min;
        return rInt;
    }
}
