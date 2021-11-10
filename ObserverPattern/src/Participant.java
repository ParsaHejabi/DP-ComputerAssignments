public class Participant implements Observer {

    private String name;
    private String interest;

    public Participant(String name, String interest, Subject auction) {
        this.name = name;
        this.interest = interest;
        auction.registerObserver(this);
    }

    @Override
    public void update(Observer observer, String interest, int price, boolean isSold) {
        if (this.interest.equals(interest) && !isSold){
            System.out.println("Auction to " + this.name + ": The new price " + price + " for " + interest + " item has been placed by: " + observer.toString());
        }
        else if (this.interest.equals(interest)){
            System.out.println("Auction to " + this.name + ": The " + interest + " item was sold to " + observer.toString() + ". price: " + price);
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
