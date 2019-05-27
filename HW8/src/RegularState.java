public class RegularState implements CustomerState {
    private final Customer customer;

    RegularState(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void promoteCustomer() {
        if (customer.getDistanceWent() >= 20000 && customer.getDistanceWent() < 50000) {
            System.out.println("You promoted to a silver customer.");
            customer.setState(customer.getSilverState());
        }
        else if (customer.getDistanceWent() >= 50000) {
            System.out.println("You promoted to a gold customer.");
            customer.setState(customer.getGoldState());
        }
    }

    @Override
    public void decreaseCustomer() {
        System.out.println("You can't decrease a regular customer!");
    }

    @Override
    public void calculatePrice() {
        System.out.println("You are a regular customer. You have no discount.");
    }
}
