// IroningService.java
public class IroningService implements LaundryService {
    private final double COST = 3.0;

    @Override
    public String getDescription() {
        return "Ironing";
    }

    @Override
    public double getCost() {
        return COST;
    }

    @Override
    public void accept(LaundryServiceVisitor visitor) {
        visitor.visit(this);
    }
}
