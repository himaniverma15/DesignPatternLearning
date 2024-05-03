package BuilderDesignPattern;

public class ProductBuilder {
    Product product = new Product();

    public ProductBuilder setProductName(String name) {
        product.setName(name);
        return this;
    }

    public ProductBuilder provideProductDescription(String description) {
        product.setDescription(description);
        return this;
    }

    public ProductBuilder setProductPrice(int price) {
        product.setPrice(price);
        return this;
    }

    public Product build() {
        return product;
    }

}
