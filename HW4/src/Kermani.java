public class Kermani implements IReceiver {
    @Override
    public void action(String food) {
        System.out.println(food + " food is getting cooked from Kermani restaurant.");
    }
}
