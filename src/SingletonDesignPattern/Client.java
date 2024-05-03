package SingletonDesignPattern;

public class Client {
    public static void main(String[] args) {

        Singleton singleton1 = Singleton.create();

        System.out.println(singleton1);

        Singleton singleton2 = Singleton.create();

        System.out.println(singleton2);
    }
}
