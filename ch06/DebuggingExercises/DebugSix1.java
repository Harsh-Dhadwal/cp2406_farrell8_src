// DebugSix1.java
// Start with a penny
// double it every
   // how much do you have in a 30-day month?
public class DebugSix1
{
   public static void main(String args[])
   {
      final int days = 30;
      double money = 0.01;
      int day = 1;
      while(day < days)
      {
         money = 2 * money;
         System.out.println("After day " + day +
            " you have " + money);
         ++day;
      }
   }
}