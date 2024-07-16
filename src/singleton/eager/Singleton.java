package singleton.eager;

public class Singleton {
    private static final Singleton INSTANCE = new Singleton();
    private Singleton() {}
    private static Singleton getInstance() {
        return INSTANCE;
    }
}
