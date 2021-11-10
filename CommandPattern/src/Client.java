public class Client {
    public void createCommand(String food, Invoker invoker, IReceiver iReceiver){
        ICommand command = new Command(food, iReceiver);
        invoker.addiCommand(command);
    }
}
