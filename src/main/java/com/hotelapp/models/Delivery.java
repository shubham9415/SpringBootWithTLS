package com.hotelapp.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Delivery {

    @Id
    @GeneratedValue(generator = "del_id", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "del_id", sequenceName = "delivery_id")
    private Integer deliveryId;
    private String partnersName;
    private Double charges;
    @ManyToMany(mappedBy = "delivery")
    @JsonIgnore
    private Set<Hotel> hotelList = new HashSet<>();

    public Delivery(String partnersName, Double charges) {
        this.partnersName = partnersName;
        this.charges = charges;
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "partnersName='" + partnersName + '\'' +
                ", charges='" + charges + '\'' +
                '}';
    }
}
