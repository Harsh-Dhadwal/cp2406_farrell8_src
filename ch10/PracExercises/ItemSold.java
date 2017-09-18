package PracExercises;

public class ItemSold {
    private int invoiceNo;
    private String description;
    private double price;

    public void setInvoiceNo(int invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getInvoiceNo(){
        return invoiceNo;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
}
