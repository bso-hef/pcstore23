package de.bsohef;

import javax.management.Attribute;

public abstract class AttributeValue {
    private String name;
    private Attribute attribute;

    public AttributeValue(String name, Attribute attribute) {
        this.name = name;
        this.attribute = attribute;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }
}
