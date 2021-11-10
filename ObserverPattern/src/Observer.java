public interface Observer {
    void update(Observer observer, String interest, int price, boolean isSold);
}
