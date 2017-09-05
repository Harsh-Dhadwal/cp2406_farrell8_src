package PracExercises;

        import java.util.ArrayList;
        import java.util.List;

public class sortNumList {
    public static void main(String[] args) {
        List<Integer> intArray = new ArrayList<>();

        intArray.add(1);
        intArray.add(2);
        intArray.add(3);
        intArray.add(4);
        intArray.add(5);

        /*for (int x = 0; x < 6; ++x) {
            intArray.add((int ) (Math.random() * 7)*10);
        }*/

        System.out.println(intArray);

        int totalComb = intArray.size()*intArray.size();

        int counter = 0;
        for(int i = 0; i < totalComb; ++i){
            int num1 = intArray.get(counter);
            int num2;
            if (counter < (intArray.size()-1)){
                num2 = intArray.get(counter+1);
            }
            else {
                num2 = intArray.get(0);
                counter = 0;
            }
            System.out.println(num1 + " " + num2);

            if (num2 > num1) {
                intArray.set(counter, num2);
                intArray.set(counter+1, num1);
            }
            counter++;
            System.out.println(intArray);
        }

    }

}
