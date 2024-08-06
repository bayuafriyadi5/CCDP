// LaundryReceipt.java
public class LaundryReceipt {
    private String name;
    private String dateIn;
    private double weight;
    private String dateOut;
    private double totalPrice;
    private final int RATE_PER_KG = 7000; // Example rate per kilogram

    public void setState(String name, String dateIn, double weight, String dateOut) {
        this.name = name;
        this.dateIn = dateIn;
        this.weight = weight;
        this.dateOut = dateOut;
        this.totalPrice = calculateTotalPrice(weight);
    }

    private double calculateTotalPrice(double weight) {
        return weight * RATE_PER_KG;
    }

    public LaundryMemento saveStateToMemento() {
        return new LaundryMemento(name, dateIn, weight, dateOut, totalPrice);
    }

    public void getStateFromMemento(LaundryMemento memento) {
        this.name = memento.getName();
        this.dateIn = memento.getDateIn();
        this.weight = memento.getWeight();
        this.dateOut = memento.getDateOut();
        this.totalPrice = memento.getTotalPrice();
    }

    public void printReceipt() {
        System.out.println("====== Laundry Receipt ======");
        System.out.println("Name: " + name);
        System.out.println("Date In: " + dateIn);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Date Out: " + dateOut);
        System.out.println("Total Price: Rp." + totalPrice);
        System.out.println("=============================");
    }
}
