// LaundryReceipt.java
import java.util.ArrayList;
import java.util.List;

public class LaundryReceipt {
    private String name;
    private String dateIn;
    private double weight;
    private String dateOut;
    private final double RATE_PER_KG = 5.0;
    private List<LaundryService> services = new ArrayList<>();

    public LaundryReceipt(String name, String dateIn, double weight, String dateOut) {
        this.name = name;
        this.dateIn = dateIn;
        this.weight = weight;
        this.dateOut = dateOut;
    }

    public void addService(LaundryService service) {
        services.add(service);
    }

    public String getDescription() {
        StringBuilder description = new StringBuilder();
        description.append("Name: ").append(name).append("\n");
        description.append("Date In: ").append(dateIn).append("\n");
        description.append("Weight: ").append(weight).append(" kg\n");
        description.append("Date Out: ").append(dateOut).append("\n");

        if (!services.isEmpty()) {
            description.append("Services:\n");
            for (LaundryService service : services) {
                description.append(" + ").append(service.getDescription()).append("\n");
            }
        }

        return description.toString();
    }

    public double getCost() {
        double totalCost = weight * RATE_PER_KG;
        for (LaundryService service : services) {
            totalCost += service.getCost();
        }
        return totalCost;
    }

    public void printReceipt() {
        System.out.println("====== Laundry Receipt ======");
        System.out.println(getDescription());
        System.out.println("Total Price: $" + getCost());
        System.out.println("=============================");
    }
}
