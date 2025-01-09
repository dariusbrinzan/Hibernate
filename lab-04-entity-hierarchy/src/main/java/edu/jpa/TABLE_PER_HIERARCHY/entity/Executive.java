package edu.jpa.TABLE_PER_HIERARCHY.entity;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("Executive")
public class Executive extends Employee {
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
