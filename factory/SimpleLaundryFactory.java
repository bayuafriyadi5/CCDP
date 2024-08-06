// SimpleLaundryFactory.java
public class SimpleLaundryFactory implements LaundryFactory {
    @Override
    public LaundryReceipt createReceipt(String name, String dateIn, double weight, String dateOut, double totalPrice) {
        return new SimpleLaundryReceipt(name, dateIn, weight, dateOut, totalPrice);
    }
}
