// Sum and average an array of integers
public class DebugEight2
{
   public static void main(String args[])
   {
      int[] someNums = {4, 17, 22, 8, 35};
      int total = 0;
      int x;
      for(x = 0; x < someNums.length; ++x){
          total += someNums[x];
      }

      float avg = (float) total/someNums.length;

      System.out.println("Sum is " + total);
      System.out.println("Average is " + avg);
   }
}
