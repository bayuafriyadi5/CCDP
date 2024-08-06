// LaundryServiceVisitor.java
public interface LaundryServiceVisitor {
    void visit(BasicLaundryReceipt receipt);
    void visit(FragranceService fragranceService);
    void visit(IroningService ironingService);
}
