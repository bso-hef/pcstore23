package de.bsohef.customer;

import java.util.ArrayList;

public class Customer {

    private long id;

    private String number;

    private ArrayList<Address> billingAddresses;

    private ArrayList<Address> shippingAddress;

    private String phone;

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

    public ArrayList<Address> getBillingAddresses() {
        return billingAddresses;
    }

    public void setBillingAddresses(ArrayList<Address> billingAddresses) {
        this.billingAddresses = billingAddresses;
    }

    public ArrayList<Address> getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(ArrayList<Address> shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
