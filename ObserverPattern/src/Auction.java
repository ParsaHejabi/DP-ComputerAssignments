import java.util.ArrayList;

public class Auction implements Subject {

    private ArrayList<Observer> observers;
    private Observer observer;
    private String interest;
    private int bidAmount;
    private boolean isSold;
    private int bidCount;

    public Auction() {
        observers = new ArrayList<>();
        interest = "";
        bidAmount = 0;
        isSold = false;
        bidCount = 0;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer:observers) {
            observer.update(this.observer, interest, bidAmount, isSold);
        }
    }

    public void startAuction(String interest, int bidAmount){
        this.interest = interest;
        this.bidAmount = bidAmount;
        this.isSold = false;
        this.bidCount = 0;
    }

    public void setBidAmount(Observer observer, int bidAmount) {
        if (!isSold){
            if (bidCount >= 10){
                isSold = true;
                notifyObservers();
            }
            else{
                if (bidAmount > this.bidAmount){
                    this.observer = observer;
                    this.bidAmount = bidAmount;
                    bidCount++;
                    notifyObservers();
                }
                else{
                    System.out.println("New bid amount cannot be less or equal to current bid amount.");
                }
            }
        }
        else{
            System.out.println("The last auction is over!");
        }
    }

    public void endAuction(){
        this.isSold = true;
    }
}
