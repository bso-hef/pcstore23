package de.bsohef;

import java.util.List;

public class Product {

    private String name;

    private String manufacturer;

    private String productName;

    private String category;

    private boolean sellable;

    private String description;

    private List<AttributeValue> attributes;

    public Product(String name, String manufacturer, String productName, String category, boolean sellable, String description) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.productName = productName;
        this.category = category;
        this.sellable = sellable;
        this.description = description;
    }

    public Product(String name, String manufacturer, String productName, String category, boolean sellable, String description, List<AttributeValue> attributes) {
        this(name, manufacturer, productName, category, sellable, description);
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", productName='" + productName + '\'' +
                ", category='" + category + '\'' +
                ", sellable=" + sellable +
                ", description='" + description + '\'' +
                ", attributes=" + attributes +
                '}';
    }

}
