package PracExercises;

public class CountByThrees {
    public static void main(String[] args) {
        int start = 0, stop = 300;
        int countBy = 3;
        int totalCounts = stop/countBy;
        int countPerLine = 10;

        for (int i = 1; i <= totalCounts; i++){
            start = start + countBy;
            if (i > countPerLine){
                countPerLine += 10;
                System.out.println("\n");
                System.out.print(start + ", ");
            }
            else {
                System.out.print(start + ", ");
            }
        }
    }
}
