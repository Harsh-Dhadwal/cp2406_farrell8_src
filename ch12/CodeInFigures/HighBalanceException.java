package CodeInFigures;

class HighBalanceException extends Exception
{
   public HighBalanceException()
   {
      super("Customer balance is high");
   }
}
