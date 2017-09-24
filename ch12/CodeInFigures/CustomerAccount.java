package CodeInFigures;

class CustomerAccount
{

   public CustomerAccount(int num, double bal) throws HighBalanceException
   {
      int acctNum = num;
      double balance = bal;
      double HIGH_CREDIT_LIMIT = 20000.00;
      if(balance > HIGH_CREDIT_LIMIT)
         throw(new HighBalanceException());
   }
}
