package de.bsohef;

public class IntegerValue extends AttributeValue{

    private int value;

    public IntegerValue(Attribute attribute, int value) {
        super(attribute);
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
