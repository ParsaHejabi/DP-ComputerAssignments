class Customer {
    private final CustomerState regularState;
    private final CustomerState silverState;
    private final CustomerState goldState;

    private CustomerState state;
    private int distanceWent;

    Customer(int distanceWent) {
        regularState = new RegularState(this);
        silverState = new SilverState(this);
        goldState = new GoldState(this);

        this.distanceWent = distanceWent;

        if (this.distanceWent < 20000)
            this.state = new RegularState(this);
        else if (this.distanceWent < 50000)
            this.state = new SilverState(this);
        else
            this.state = new GoldState(this);
    }

    void promoteCustomer() {
        state.promoteCustomer();
    }

    void decreaseCustomer() {
        state.decreaseCustomer();
    }

    void calculatePrice() {
        state.calculatePrice();
    }

    void setState(CustomerState state) {
        this.state = state;
    }

    int getDistanceWent() {
        return distanceWent;
    }

    void setDistanceWent(int distanceWent) {
        this.distanceWent = distanceWent;
    }

    CustomerState getRegularState() {
        return regularState;
    }

    CustomerState getSilverState() {
        return silverState;
    }

    CustomerState getGoldState() {
        return goldState;
    }
}
