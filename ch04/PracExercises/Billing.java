package PracExercises;

public class Billing
{
    private static final double tax = 0.08;

    public double computeBill(double price)
    {
        double totalDue = price + (price * tax);
        return totalDue;
    }

    public double computeBill(double price, int quantity)
    {
        double totalPrice = price * quantity;
        double totalDue = totalPrice + (totalPrice * tax);
        return totalDue;
    }

    public double computeBill(double price, int quantity, double coupon)
    {
        double totalPrice = (price * quantity) - coupon;
        double totalDue = totalPrice + (totalPrice * tax);
        return totalDue;
    }

}
