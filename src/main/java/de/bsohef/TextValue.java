package de.bsohef;

import javax.management.Attribute;

public class TextValue extends AttributeValue{
    private String value;

    public TextValue(String name, Attribute attribute, String value) {
        super(name, attribute);
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
