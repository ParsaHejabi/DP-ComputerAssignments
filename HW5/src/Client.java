public class Client {
    public static void main(String[] args) {
        IFoursquare iFoursquare = new Adapter();
        System.out.println(iFoursquare.FoursquareSurface(0, 0, 0, 2, 3, 2, 3, 0));
    }
}
