package CodeInFigures;

class DemoStackTrace
{
   public static void main(String[] args)
   {
      methodA();  // line 5
   }
   private static void methodA()
   {
      System.out.println("In methodA()");
      methodB();  // line 10
   }
   private static void methodB()
   {
      System.out.println("In methodB()");
      methodC();  // line 15
   }
   private static void methodC()
   {
      System.out.println("In methodC()");
      int [] array = {0, 1, 2};
      System.out.println(array[3]);  // line 21
   }
}
