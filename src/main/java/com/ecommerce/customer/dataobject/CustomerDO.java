package com.ecommerce.customer.dataobject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "customer")
public class CustomerDO {
    @Id
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "email_address")
    private String emailAddress;
    @Column(name = "postal_address")
    private String postalAddress;
    @Column(name = "order_ids")
    private Set<String> orderIds;

    public CustomerDO(String id, String name, String emailAddress, String postalAddress, Set<String> orderIds) {
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
