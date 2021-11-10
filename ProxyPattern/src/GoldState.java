public class GoldState implements CustomerState {
    private final Customer customer;

    GoldState(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void promoteCustomer() {
        System.out.println("You can't promote a gold customer!");
    }

    @Override
    public void decreaseCustomer() {
        customer.setDistanceWent(0);

        customer.setState(customer.getSilverState());
    }

    @Override
    public void calculatePrice() {
        System.out.println(
                "You are a gold customer. You have 20% discount in ticket price and 40% discount in overweight."
        );
    }
}
