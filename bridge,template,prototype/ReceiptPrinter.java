public abstract class ReceiptPrinter {
  protected LaundryReceipt receipt;

  public ReceiptPrinter(LaundryReceipt receipt) {
      this.receipt = receipt;
  }

  public abstract void printReceipt();
}
