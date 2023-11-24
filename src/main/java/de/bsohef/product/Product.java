package de.bsohef.product;

public class Product {

    private long id;
    private String name;
    private String manufacturer;
    private String productNumber;
    private String category;
    private boolean sellable;
    private String description;
    private List<AttributeValue> attributes;

    public Product(String name, String manufactorer, String productNumber, String category, boolean sellable, String description) {
        this.name = name;
        this.manufacturer = manufactorer;
        this.productNumber = productNumber;
        this.category = category;
        this.sellable = sellable;
        this.description = description;
    }

    public Product(String name, String manufactorer, String productNumber, String category, boolean sellable, String description, List<AttributeValue> attributes) {
        this(name, manufactorer, productNumber, category, sellable, description);
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "name='" + name + '\'' +
                ", manufactorer='" + manufacturer + '\'' +
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

    public boolean isSellable() {
        return sellable;
    }

    public void setSellable(boolean sellable) {
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
