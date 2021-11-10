import java.util.ArrayList;

public class SingletonDemo {
    public static void main(String[] args) {
        ArrayList<Singleton> singletons = new ArrayList<>();
        for (int i = 1; i <= 12; i++) {
            Singleton singleton = Singleton.getInstance();
            if (!(singleton == null)) {
                singletons.add(singleton);
            }
        }
        System.out.println("Size of singletons ArrayList is: " + singletons.size());
    }
}
