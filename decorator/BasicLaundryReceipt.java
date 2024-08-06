// BasicLaundryReceipt.java
public class BasicLaundryReceipt implements LaundryReceipt {
    private String name;
    private String dateIn;
    private double weight;
    private String dateOut;
    private final double RATE_PER_KG = 5.0;

    public BasicLaundryReceipt(String name, String dateIn, double weight, String dateOut) {
        this.name = name;
        this.dateIn = dateIn;
        this.weight = weight;
        this.dateOut = dateOut;
    }

    @Override
    public String getDescription() {
        return "Name: " + name + "\nDate In: " + dateIn + "\nWeight: " + weight + " kg\nDate Out: " + dateOut;
    }

    @Override
    public double getCost() {
        return weight * RATE_PER_KG;
    }

    public void printReceipt() {
        System.out.println("====== Laundry Receipt ======");
        System.out.println(getDescription());
        System.out.println("Total Price: $" + getCost());
        System.out.println("=============================");
    }
}
