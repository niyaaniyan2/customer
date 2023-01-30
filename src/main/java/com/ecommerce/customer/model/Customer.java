package com.ecommerce.customer.model;

import java.util.Set;

public class Customer {

    private String id;
    private String name;
    private String emailAddress;
    private String postalAddress;
    private Set<String> orderIds;

    public Customer(String id, String name, String emailAddress, String postalAddress, Set<String> orderIds) {
        this.id = id;
        this.name = name;
        this.emailAddress = emailAddress;
        this.postalAddress = postalAddress;
        this.orderIds = orderIds;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    public Set<String> getOrderIds() {
        return orderIds;
    }

    public void setOrderIds(Set<String> orderIds) {
        this.orderIds = orderIds;
    }
}
