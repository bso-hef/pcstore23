package de.bsohef;

import java.util.ArrayList;
import java.util.List;

public class CombinedProdukt extends Product{
    private ArrayList<Product> components;

    public CombinedProdukt(String name, String manufacturer, String productNumber, String category, Boolean sellable, String description) {
        super(name, manufacturer, productNumber, category, sellable, description);
    }

    public CombinedProdukt(String name, String manufacturer, String productNumber, String category, Boolean sellable, String description, List<AttributeValue> attributes) {
        super(name, manufacturer, productNumber, category, sellable, description, attributes);
    }

    public CombinedProdukt(String name, String manufacturer, String productNumber, String category, Boolean sellable, String description, ArrayList<Product> components) {
        super(name, manufacturer, productNumber, category, sellable, description);
        this.components = components;
    }

    public CombinedProdukt(String name, String manufacturer, String productNumber, String category, Boolean sellable, String description, List<AttributeValue> attributes, ArrayList<Product> components) {
        super(name, manufacturer, productNumber, category, sellable, description, attributes);
        this.components = components;
    }

    @Override
    public String toString() {
        return "CombinedProdukt{" +
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
