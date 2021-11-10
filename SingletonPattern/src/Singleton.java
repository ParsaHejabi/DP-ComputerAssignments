/**
 * This Singleton class permits just 10 number of instances.
 */
public class Singleton {
    private static int numberOfSingletonObjectsAlive = 0;
    private static Singleton singleton = null;

    private Singleton(){}

    public static Singleton getInstance() {
        if (numberOfSingletonObjectsAlive < 10) {
            singleton = new Singleton();
            numberOfSingletonObjectsAlive++;
            return singleton;
        }
        else {
            System.out.println("Maximum number of instances of this class is created. returning null.");
            return null;
        }
    }
}