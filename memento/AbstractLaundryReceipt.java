public abstract class AbstractLaundryReceipt implements LaundryReceipt {
    protected String name;
    protected String dateIn;
    protected double weight;
    protected String dateOut;
    protected double totalPrice;
    protected final int RATE_PER_KG = 7000; // Example rate per kilogram

    @Override
    public void setState(String name, String dateIn, double weight, String dateOut) {
        this.name = name;
        this.dateIn = dateIn;
        this.weight = weight;
        this.dateOut = dateOut;
        this.totalPrice = calculateTotalPrice(weight);
    }

    protected double calculateTotalPrice(double weight) {
        return weight * RATE_PER_KG;
    }

    @Override
    public LaundryMemento saveStateToMemento() {
        return new LaundryMemento(name, dateIn, weight, dateOut, totalPrice);
    }

    @Override
    public void getStateFromMemento(LaundryMemento memento) {
        this.name = memento.getName();
        this.dateIn = memento.getDateIn();
        this.weight = memento.getWeight();
        this.dateOut = memento.getDateOut();
        this.totalPrice = memento.getTotalPrice();
    }

    public abstract void printReceipt();
}
