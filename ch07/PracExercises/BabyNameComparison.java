package PracExercises;

import java.util.ArrayList;
import java.util.Scanner;

public class BabyNameComparison {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        for (int i = 1; i <= 3; i++) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter name no. " + i + " >>> ");
            String name = input.next();
            names.add(name);
        }

        for(int j = 0; j <= 2; j++){
            int k;

            if (j > 1){
                k = -1;
            }
            else {
                k = j;
            }

            k++;

            System.out.println(names.get(j)+names.get(k));
            System.out.println(names.get(k)+names.get(j));
        }

    }

}
