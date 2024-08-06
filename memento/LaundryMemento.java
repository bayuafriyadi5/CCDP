// LaundryMemento.java
public class LaundryMemento {
    private final String name;
    private final String dateIn;
    private final double weight;
    private final String dateOut;
    private final double totalPrice;

    public LaundryMemento(String name, String dateIn, double weight, String dateOut, double totalPrice) {
        this.name = name;
        this.dateIn = dateIn;
        this.weight = weight;
        this.dateOut = dateOut;
        this.totalPrice = totalPrice;
    }

    public String getName() {
        return name;
    }

    public String getDateIn() {
        return dateIn;
    }

    public double getWeight() {
        return weight;
    }

    public String getDateOut() {
        return dateOut;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
