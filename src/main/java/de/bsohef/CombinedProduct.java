package de.bsohef;

import java.util.ArrayList;
import java.util.List;

public class CombinedProduct extends Product {

    private ArrayList<Product> components;

    public CombinedProduct(String name, String manufacturer, String productName, String category, boolean sellable, String description, ArrayList<Product> components) {
        super(name, manufacturer, productName, category, sellable, description);
        this.components = components;
    }

    public CombinedProduct(String name, String manufacturer, String productName, String category, boolean sellable, String description) {
        super(name, manufacturer, productName, category, sellable, description);
    }

    public CombinedProduct(String name, String manufacturer, String productName, String category, boolean sellable, String description, List<AttributeValue> attributes, ArrayList<Product> components) {
        super(name, manufacturer, productName, category, sellable, description, attributes);
        this.components = components;
    }

    public CombinedProduct(String name, String manufacturer, String productName, String category, boolean sellable, String description, List<AttributeValue> attributes) {
        super(name, manufacturer, productName, category, sellable, description, attributes);
    }

    void addComponent(Product product) {
        this.components.add(product);
    }

    void removeComponent(Product product) {
        this.components.remove(product);
    }

    @Override
    public String toString() {
        return "CombinedProduct{" +
                "components=" + components +
                '}';
    }

    public ArrayList<Product> getComponents() {
        return components;
    }

    public void setComponents(ArrayList<Product> components) {
        this.components = components;
    }
}
