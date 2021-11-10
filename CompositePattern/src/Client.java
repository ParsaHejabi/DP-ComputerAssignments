public class Client {
    private Unit greatUnit;

    public Client(Unit greatUnit) {
        this.greatUnit = greatUnit;
    }

    public void print() {
        greatUnit.print();
    }
}
