package de.bsohef;

public class Attribute {

    private String name;

    private String unitOfMeasure;

    private AttributeType type;

    public Attribute(String name, String unitOfMeasure, AttributeType type) {
        this.name = name;
        this.unitOfMeasure = unitOfMeasure;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public AttributeType getType() {
        return type;
    }

    public void setType(AttributeType type) {
        this.type = type;
    }
}
