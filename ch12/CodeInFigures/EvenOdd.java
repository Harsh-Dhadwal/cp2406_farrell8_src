package CodeInFigures;

import java.util.Scanner;
class EvenOdd
{
   public static void main(String[] args) 
   {  
       Scanner input = new Scanner(System.in);
       int number;
       System.out.print("Enter a number >> ");
       number = input.nextInt();
       if(isEven(number))
          System.out.println(number + " is even");
       else
          System.out.println(number + " is odd");
   }
   private static boolean isEven(int number)
   {
      boolean result;
      if(number % 2 == 1)
         result = false;
      else
      {
         result = true;
         assert number % 2 == 0 : number + " % 2 is " + number % 2;
      } 
      return result;
   }      
}
