class Airline {
    public static void main(String[] args) {
        Customer regularCustomer = new Customer(0);

        regularCustomer.calculatePrice();

        regularCustomer.promoteCustomer();

        regularCustomer.calculatePrice();

        regularCustomer.setDistanceWent(20000);

        regularCustomer.promoteCustomer();

        regularCustomer.calculatePrice();

        regularCustomer.decreaseCustomer();

        regularCustomer.calculatePrice();

        Customer goldCustomer = new Customer(50000);

        goldCustomer.calculatePrice();

        goldCustomer.promoteCustomer();

        goldCustomer.calculatePrice();

        goldCustomer.decreaseCustomer();

        goldCustomer.calculatePrice();

        goldCustomer.setDistanceWent(50000);

        goldCustomer.promoteCustomer();

        goldCustomer.calculatePrice();
    }
}
