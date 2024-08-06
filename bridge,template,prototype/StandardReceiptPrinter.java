public class StandardReceiptPrinter extends ReceiptPrinter {
  public StandardReceiptPrinter(LaundryReceipt receipt) {
      super(receipt);
  }

  @Override
  public void printReceipt() {
      System.out.println("====== Laundry Receipt ======");
      System.out.println("Name: " + receipt.getName());
      System.out.println("Date In: " + receipt.getDateIn());
      System.out.println("Weight: " + receipt.getWeight() + " kg");
      System.out.println("Date Out: " + receipt.getDateOut());
      System.out.println("Total Price: Rp." + receipt.getTotalPrice());
      System.out.println("=============================");
  }
}
