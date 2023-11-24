package de.bsohef;

import java.util.List;

public class Product {
    private String name;
    private String manufacturer;
    private String productNumber;
    private String category;
    private Boolean sellable;
    private String description;
    private List<AttributeValue> attributes;


    public Product(String name, String manufacturer, String productNumber, String category, Boolean sellable, String description) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.productNumber = productNumber;
        this.category = category;
        this.sellable = sellable;
        this.description = description;
    }

    public Product(String name, String manufacturer, String productNumber, String category, Boolean sellable, String description, List<AttributeValue> attributes) {
        this(name, manufacturer, productNumber, category, sellable, description);
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", productNumber='" + productNumber + '\'' +
                ", category='" + category + '\'' +
                ", sellable=" + sellable +
                ", description='" + description + '\'' +
                ", attributes=" + attributes +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getSellable() {
        return sellable;
    }

    public void setSellable(Boolean sellable) {
        this.sellable = sellable;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<AttributeValue> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<AttributeValue> attributes) {
        this.attributes = attributes;
    }
}

