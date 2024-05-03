package BuilderDesignPattern;

public class Product {
    private String name;
    private String Description;
    private int price;
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        Description = description;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "BuilderDesignPattern.Product{" +
                "name='" + name + '\'' +
                ", Description='" + Description + '\'' +
                ", price=" + price +
                '}';
    }
}
