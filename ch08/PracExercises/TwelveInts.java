package PracExercises;

public class TwelveInts {
    public static void main(String[] args) {
        int [] intArray = {0, 1, 2, 3, 4, 5,
                           6, 7, 8, 9, 10, 11};

        for (int i = 0; i < intArray.length; ++i ){
            System.out.print(intArray[i]);
            if (i < (intArray.length -1)) {
                System.out.print(", ");
            }
            else {
                System.out.print("\n");
            }
        }

        for (int i = (intArray.length - 1); i >= 0; --i ){
            System.out.print(intArray[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
    }
}
