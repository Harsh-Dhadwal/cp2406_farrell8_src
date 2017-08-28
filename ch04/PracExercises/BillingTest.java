package PracExercises;

public class BillingTest {
    public static void main(String[] args) {
        double bookPrice = 10.5;
        int bookQuantity = 4;
        double couponValue = 2.5;

        Billing Bill = new Billing();

        double Bill1 = Bill.computeBill(bookPrice);
        System.out.println("Total Due for 1 book: " + Bill1);

        double Bill2 = Bill.computeBill(bookPrice, bookQuantity);
        System.out.println("Total Due for 1 book: " + Bill2);

        double Bill3 = Bill.computeBill(bookPrice, bookQuantity, couponValue);
        System.out.println("Total Due for 1 book: " + Bill3);
    }

}
