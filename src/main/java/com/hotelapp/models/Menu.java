package com.hotelapp.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Menu {

    @GeneratedValue(generator = "menu_id", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "menu_id", sequenceName = "menu_id")
    @Id
    private Integer menuId;
    private String menuName;
    private double price;
    @ManyToOne
    @JoinColumn(name = "hotel_id")
    @JsonIgnore
    private Hotel hotel;

    public Menu(String menuName, double price) {
        this.menuName = menuName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuName='" + menuName + '\'' +
                ", price=" + price +
                '}';
    }
}
