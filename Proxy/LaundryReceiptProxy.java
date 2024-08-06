// LaundryReceiptProxy.java
public class LaundryReceiptProxy implements LaundryReceipt {
    private BasicLaundryReceipt realReceipt;
    private String name;
    private String dateIn;
    private double weight;
    private String dateOut;

    public LaundryReceiptProxy(String name, String dateIn, double weight, String dateOut) {
        this.name = name;
        this.dateIn = dateIn;
        this.weight = weight;
        this.dateOut = dateOut;
    }

    private void createRealReceipt() {
        if (realReceipt == null) {
            realReceipt = new BasicLaundryReceipt(name, dateIn, weight, dateOut);
        }
    }

    @Override
    public void addService(LaundryService service) {
        createRealReceipt();
        realReceipt.addService(service);
    }

    @Override
    public String getDescription() {
        createRealReceipt();
        return realReceipt.getDescription();
    }

    @Override
    public double getCost() {
        createRealReceipt();
        return realReceipt.getCost();
    }

    @Override
    public void printReceipt() {
        createRealReceipt();
        realReceipt.printReceipt();
    }
}
