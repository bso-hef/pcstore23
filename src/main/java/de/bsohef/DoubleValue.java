package de.bsohef;

import javax.management.Attribute;

public class DoubleValue extends AttributeValue{
    private Double value;

    public DoubleValue(String name, Attribute attribute, Double value) {
        super(name, attribute);
        this.value = value;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
