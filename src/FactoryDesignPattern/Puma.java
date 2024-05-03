package FactoryDesignPattern;


import BuilderDesignPattern.ProductBuilder;

public class Puma implements Product {
    @Override
    public String produce() {
        return "Puma Product produced";
    }
}
