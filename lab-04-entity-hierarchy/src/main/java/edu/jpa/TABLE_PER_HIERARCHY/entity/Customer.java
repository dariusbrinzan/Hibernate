package edu.jpa.TABLE_PER_HIERARCHY.entity;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("Customer")
public class Customer extends Person {
    private double discount;

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
