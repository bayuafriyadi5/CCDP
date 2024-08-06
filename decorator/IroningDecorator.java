// IroningDecorator.java
public class IroningDecorator extends LaundryReceiptDecorator {
    private final double IRONING_COST = 3.0;

    public IroningDecorator(LaundryReceipt decoratedReceipt) {
        super(decoratedReceipt);
    }

    @Override
    public String getDescription() {
        return decoratedReceipt.getDescription() + "\n + Ironing";
    }

    @Override
    public double getCost() {
        return decoratedReceipt.getCost() + IRONING_COST;
    }
}
