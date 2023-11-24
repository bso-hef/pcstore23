package de.bsohef.product;

import javax.management.AttributeValueExp;
import java.util.List;

public class CombinedProduct extends Product{

    private List<Product> components;

    public CombinedProduct(String name, String manufactorer, String productNumber, String category, boolean sellable, String description, List<Product> components) {
        super(name, manufactorer, productNumber, category, sellable, description);
        this.components = components;
    }

    public CombinedProduct(String name, String manufactorer, String productNumber, String category, boolean sellable, String description) {
        this(name, manufactorer, productNumber, category, sellable, description, (List<Product>) null);
    }

    public CombinedProduct(String name, String manufactorer, String productNumber, String category, boolean sellable, String description, List<AttributeValueExp> attributes, List<Product> components) {
        super(name, manufactorer, productNumber, category, sellable, description, attributes);
        this.components = components;
    }

    public CombinedProduct(String name, String manufactorer, String productNumber, String category, boolean sellable, String description, List<AttributeValue> attributes) {
        super(name, manufactorer, productNumber, category, sellable, description, attributes);
    }
}
