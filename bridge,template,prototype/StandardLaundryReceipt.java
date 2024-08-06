public class StandardLaundryReceipt implements LaundryReceipt {
  private String name;
  private String dateIn;
  private double weight;
  private String dateOut;
  private double totalPrice;
  private final int RATE_PER_KG = 7000; // Example rate per kilogram

  @Override
  public void setState(String name, String dateIn, double weight, String dateOut) {
      this.name = name;
      this.dateIn = dateIn;
      this.weight = weight;
      this.dateOut = dateOut;
      this.totalPrice = calculateTotalPrice(weight);
  }

  private double calculateTotalPrice(double weight) {
      return weight * RATE_PER_KG;
  }

  @Override
  public LaundryMemento saveStateToMemento() {
      return new LaundryMemento(name, dateIn, weight, dateOut, totalPrice);
  }

  @Override
  public void getStateFromMemento(LaundryMemento memento) {
      this.name = memento.getName();
      this.dateIn = memento.getDateIn();
      this.weight = memento.getWeight();
      this.dateOut = memento.getDateOut();
      this.totalPrice = memento.getTotalPrice();
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
