public class LaundryBuilder {
    private Laundry laundry;

    public LaundryBuilder() {
        this.laundry = new Laundry();
    }

    public LaundryBuilder withName(String name) {
        laundry.setName(name);
        return this;
    }

    public LaundryBuilder withDateIn(String dateIn) {
        laundry.setDateIn(dateIn);
        return this;
    }

    public LaundryBuilder withWeight(double weight) {
        laundry.setWeight(weight);
        return this;
    }

    public LaundryBuilder withDateOut(String dateOut) {
        laundry.setDateOut(dateOut);
        return this;
    }

    public Laundry build(LaundryService laundryService) {
        laundry.setTotalPrice(laundryService.calculateCost(laundry.getWeight()));
        return laundry;
    }
}