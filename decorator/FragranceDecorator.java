// FragranceDecorator.java
public class FragranceDecorator extends LaundryReceiptDecorator {
    private final double FRAGRANCE_COST = 2.0;

    public FragranceDecorator(LaundryReceipt decoratedReceipt) {
        super(decoratedReceipt);
    }

    @Override
    public String getDescription() {
        return decoratedReceipt.getDescription() + "\n + Fragrance";
    }

    @Override
    public double getCost() {
        return decoratedReceipt.getCost() + FRAGRANCE_COST;
    }
}
