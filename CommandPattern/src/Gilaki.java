public class Gilaki implements IReceiver {
    @Override
    public void action(String food) {
        System.out.println(food + " food is getting cooked from Gilaki restaurant.");
    }
}
