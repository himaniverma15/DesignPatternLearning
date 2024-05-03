package FactoryDesignPattern;

public class Client {
    public static void main(String[] args) {
        String product1 = ProductFactory.generate("Puma");
        System.out.println(product1);

        String product2 = ProductFactory.generate("Addidas");
        System.out.println(product2);

        String product3 = ProductFactory.generate("Nike");
        System.out.println(product3);
    }
}
