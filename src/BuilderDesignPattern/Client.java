package BuilderDesignPattern;

public class Client {
    public static void main(String[] args) {
        Product product = new ProductBuilder()
                .setProductName("Naykaa")
                .provideProductDescription("this is osum brand")
                .setProductPrice(350)
                .build();

        System.out.println(product);
    }
}
