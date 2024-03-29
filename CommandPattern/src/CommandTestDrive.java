public class CommandTestDrive {
    public static void main(String[] args) {
        Client client1 = new Client();
        Client client2 = new Client();
        Client client3 = new Client();

        Invoker invoker1 = new Invoker();
        Invoker invoker2 = new Invoker();
        Invoker invoker3 = new Invoker();

        IReceiver iReceiver1 = new Gilaki();
        IReceiver iReceiver2 = new Kermani();
        IReceiver iReceiver3 = new Jonoobi();

        client1.createCommand("Mirzaghasemi", invoker1, iReceiver1);
        client1.createCommand("dande kabab", invoker1, iReceiver2);
        client3.createCommand("ghalie mahi", invoker3, iReceiver3);

        invoker1.execute();
        invoker3.execute();
    }
}
