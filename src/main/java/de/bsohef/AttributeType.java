package de.bsohef;

public enum AttributeType {
    BOOLEAN(1);
    private Integer id;

    AttributeType(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
