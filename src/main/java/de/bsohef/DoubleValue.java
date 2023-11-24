package de.bsohef;

public class DoubleValue extends AttributeValue {

    private Double value;

    public DoubleValue(Attribute attribute, Double value) {
        super(attribute);
        this.value = value;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
