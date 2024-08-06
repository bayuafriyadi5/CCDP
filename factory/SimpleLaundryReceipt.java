// SimpleLaundryReceipt.java
public class SimpleLaundryReceipt implements LaundryReceipt {
    private String name;
    private String dateIn;
    private double weight;
    private String dateOut;
    private double totalPrice;

    public SimpleLaundryReceipt(String name, String dateIn, double weight, String dateOut, double totalPrice) {
        this.name = name;
        this.dateIn = dateIn;
        this.weight = weight;
        this.dateOut = dateOut;
        this.totalPrice = totalPrice;
    }

    @Override
    public void printReceipt() {
        System.out.println("====== Laundry Receipt ======");
        System.out.println("Name: " + name);
        System.out.println("Date In: " + dateIn);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Date Out: " + dateOut);
        System.out.println("Total Price: $" + totalPrice);
        System.out.println("=============================");
    }
}
