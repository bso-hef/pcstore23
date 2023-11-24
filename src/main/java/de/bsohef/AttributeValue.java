package de.bsohef;

public abstract class AttributeValue {

    private Attribute attribute;

    public AttributeValue(Attribute attribute) {
        this.attribute = attribute;
    }

    public Attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }
}
