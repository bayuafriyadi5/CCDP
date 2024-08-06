// FragranceService.java
public class FragranceService implements LaundryService {
    private final double COST = 2.0;

    @Override
    public String getDescription() {
        return "Fragrance";
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
