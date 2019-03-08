public class AuctionDemo {
    public static void main(String[] args) {
        Auction auction = new Auction();

        auction.startAuction("OldCars", 10);
        Participant participant1 = new Participant("Parsa","OldCars", auction);
        Participant participant2 = new Participant("James","Paintings", auction);
        Participant participant3 = new Participant("Ali","OldCars", auction);

        auction.setBidAmount(participant1, 5);
        auction.setBidAmount(participant3, 20);
        auction.removeObserver(participant1);
        auction.setBidAmount(participant3,50);
        auction.endAuction();
        auction.startAuction("Paintings", 20);
        auction.setBidAmount(participant2, 25);
        auction.endAuction();
    }
}
