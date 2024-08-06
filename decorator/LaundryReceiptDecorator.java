// LaundryReceiptDecorator.java
public abstract class LaundryReceiptDecorator implements LaundryReceipt {
    protected LaundryReceipt decoratedReceipt;

    public LaundryReceiptDecorator(LaundryReceipt decoratedReceipt) {
        this.decoratedReceipt = decoratedReceipt;
    }

    @Override
    public String getDescription() {
        return decoratedReceipt.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedReceipt.getCost();
    }
}
