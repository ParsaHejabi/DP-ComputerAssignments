public class SilverState implements CustomerState {
    private final Customer customer;

    SilverState(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void promoteCustomer() {
        if (customer.getDistanceWent() >= 50000) {
            System.out.println("You promoted to a gold customer.");
            customer.setState(customer.getGoldState());
        }
    }

    @Override
    public void decreaseCustomer() {
        customer.setDistanceWent(0);

        customer.setState(customer.getRegularState());
    }

    @Override
    public void calculatePrice() {
        System.out.println(
                "You are a silver customer. You have 10% discount in ticket price and 20% discount in overweight."
        );
    }
}
