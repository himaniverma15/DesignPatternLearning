package FactoryDesignPattern;

public class ProductFactory {
    public static String generate(String Type) {
        String product = null;
        switch (Type) {
            case "Puma":
                product = new Puma().produce();
                break;
            case "Nike":
                product = new Nike().produce();
                break;
            case "Addidas":
                product = new Addidas().produce();
                break;
            default:
                throw new RuntimeException("No product exist with this brand!!");
        }
        return product;
    }
}
