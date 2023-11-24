package de.bsohef;

public class TextValue extends AttributeValue {

    private String value;

    public TextValue(Attribute attribute, String value) {
        super(attribute);
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
