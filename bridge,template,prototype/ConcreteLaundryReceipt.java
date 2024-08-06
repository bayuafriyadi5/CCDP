public class ConcreteLaundryReceipt extends AbstractLaundryReceipt implements Cloneable {
  @Override
  public void printReceipt() {
      System.out.println("====== Laundry Receipt ======");
      System.out.println("Name: " + name);
      System.out.println("Date In: " + dateIn);
      System.out.println("Weight: " + weight + " kg");
      System.out.println("Date Out: " + dateOut);
      System.out.println("Total Price: Rp." + totalPrice);
      System.out.println("=============================");
  }

  @Override
  public ConcreteLaundryReceipt clone() {
      try {
          return (ConcreteLaundryReceipt) super.clone();
      } catch (CloneNotSupportedException e) {
          throw new RuntimeException(e);
      }
  }

  @Override
  public String getName() {
      return name;
  }

  @Override
  public String getDateIn() {
      return dateIn;
  }

  @Override
  public double getWeight() {
      return weight;
  }

  @Override
  public String getDateOut() {
      return dateOut;
  }

  @Override
  public double getTotalPrice() {
      return totalPrice;
  }
}
