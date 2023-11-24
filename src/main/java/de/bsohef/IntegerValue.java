package de.bsohef;

import javax.management.Attribute;

public class IntegerValue extends AttributeValue{
    private Integer value;

    public IntegerValue(String name, Attribute attribute, Integer value) {
        super(name, attribute);
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
