// CostCalculatorVisitor.java
public class CostCalculatorVisitor implements LaundryServiceVisitor {
    private double totalCost;

    public double getTotalCost() {
        return totalCost;
    }

    @Override
    public void visit(BasicLaundryReceipt receipt) {
        totalCost += receipt.getCost();
    }

    @Override
    public void visit(FragranceService fragranceService) {
        totalCost += fragranceService.getCost();
    }

    @Override
    public void visit(IroningService ironingService) {
        totalCost += ironingService.getCost();
    }
}
