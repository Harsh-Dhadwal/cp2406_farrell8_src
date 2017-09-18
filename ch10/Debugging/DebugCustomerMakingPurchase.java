package Debugging;

public class DebugCustomerMakingPurchase extends DebugCustomer
{
    private double amountOfPurchase;
    private boolean overLimit;

    public DebugCustomerMakingPurchase(
            int id,
            String name,
            double credit,
            double purchAmount)
    {
        super(id, name, credit);
       amountOfPurchase = purchAmount;


       if(amountOfPurchase > credit) {
           overLimit = true;
       } else {
           overLimit = false;
       }
    }

    @Override
    public void display()
    {
        System.out.println("Customer #" + idNumber +
                " Name: " +  name + "\nCredit limit $" + creditLimit);
       System.out.println("Purchase amount $" + amountOfPurchase);
       if(overLimit)
          System.out.println("****Credit denied - customer over limit");
       else
          System.out.println("Purchase Okay");
    }
}
