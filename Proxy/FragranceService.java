// LaundryService.java
public interface LaundryService {
    String getDescription();
    double getCost();
}

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
}

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
}
