package SingletonDesignPattern;

public final class Singleton {
    private static final Singleton singleton = new Singleton();
    private Singleton() {
        System.out.println("created singleton object!!");
    }
    public static Singleton create() {
        return singleton;
    }
}
