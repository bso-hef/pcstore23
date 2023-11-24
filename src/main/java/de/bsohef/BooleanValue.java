package de.bsohef;

public class BooleanValue extends AttributeValue {

    private boolean value;

    public BooleanValue(Attribute attribute, boolean value) {
        super(attribute);
        this.value = value;
    }

    public boolean isValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }
}
