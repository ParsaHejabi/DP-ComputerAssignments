public class Command implements ICommand {
    private String food;
    private IReceiver iReceiver;

    public Command(String food, IReceiver iReceiver) {
        this.food = food;
        this.iReceiver = iReceiver;
    }

    @Override
    public void execute() {
        iReceiver.action(food);
    }
}
