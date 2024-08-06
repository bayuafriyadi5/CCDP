// LaundryReceipt.java
public interface LaundryReceipt {
    void addService(LaundryService service);
    String getDescription();
    double getCost();
    void printReceipt();
}
