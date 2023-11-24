package de.bsohef.order;

import java.util.ArrayList;
import java.util.Date;

public class Order {

    private long id;
    private String number;
    private long customerId;
    private Date orderDate;
    private long recipientAddressId;
    private long shippingAddressId;
    private ArrayList<OrderItem> orderItems = new ArrayList<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public long getRecipientAddressId() {
        return recipientAddressId;
    }

    public void setRecipientAddressId(long recipientAddressId) {
        this.recipientAddressId = recipientAddressId;
    }

    public long getShippingAddressId() {
        return shippingAddressId;
    }

    public void setShippingAddressId(long shippingAddressId) {
        this.shippingAddressId = shippingAddressId;
    }
}
