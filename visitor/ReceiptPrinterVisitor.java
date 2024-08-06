// ReceiptPrinterVisitor.java
public class ReceiptPrinterVisitor implements LaundryServiceVisitor {
    @Override
    public void visit(BasicLaundryReceipt receipt) {
        System.out.println("====== Laundry Receipt ======");
        System.out.println(receipt.getDescription());
        System.out.println("=============================");
    }

    @Override
    public void visit(FragranceService fragranceService) {
        // Do nothing
    }

    @Override
    public void visit(IroningService ironingService) {
        // Do nothing
    }
}
