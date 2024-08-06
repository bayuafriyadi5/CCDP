public interface LaundryReceipt {
    void setState(String name, String dateIn, double weight, String dateOut);
    LaundryMemento saveStateToMemento();
    void getStateFromMemento(LaundryMemento memento);
    String getName();
    String getDateIn();
    double getWeight();
    String getDateOut();
    double getTotalPrice();
}
