// LaundryFactory.java
public interface LaundryFactory {
    LaundryReceipt createReceipt(String name, String dateIn, double weight, String dateOut, double totalPrice);
}
