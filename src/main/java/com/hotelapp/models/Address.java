package com.hotelapp.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Getter
@Setter
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue(generator = "add_id", strategy = GenerationType.AUTO)
    @SequenceGenerator(name= "add_id" ,sequenceName = "address_id")
    private Integer addressId;
    private String city;
    private String streetName;
    private long zipCode;
    private String state;

    public Address(String city, String streetName, long zipCode, String state) {
        this.city = city;
        this.streetName = streetName;
        this.zipCode = zipCode;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", streetName='" + streetName + '\'' +
                ", zipCode=" + zipCode +
                ", state='" + state + '\'' +
                '}';
    }
}
