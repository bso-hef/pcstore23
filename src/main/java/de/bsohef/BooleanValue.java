package de.bsohef;

import javax.management.Attribute;

public class BooleanValue extends AttributeValue{
    private Boolean value;

    public BooleanValue(String name, Attribute attribute, Boolean value) {
        super(name, attribute);
        this.value = value;
    }

    public Boolean getValue() {
        return value;
    }

    public void setValue(Boolean value) {
        this.value = value;
    }
}
