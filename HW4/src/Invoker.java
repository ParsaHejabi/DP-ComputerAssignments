import java.util.ArrayList;

public class Invoker {
    public ArrayList<ICommand> iCommands;

    public Invoker() {
        this.iCommands = new ArrayList<>();
    }

    public void addiCommand(ICommand iCommand) {
        this.iCommands.add(iCommand);
    }

    public void execute() {
        for (ICommand iCommand : this.iCommands) {
            iCommand.execute();
        }
    }
}
