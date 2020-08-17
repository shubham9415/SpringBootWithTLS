package com.hotelapp.service;

import com.hotelapp.models.Hotel;

import java.awt.*;
import java.util.List;

public interface HotelService {

    Hotel addHotel(Hotel hotel);
    void updateHotel(Hotel hotel);
    Hotel getHotelById(int id);
    void deleteHotel(int hotelId);

    List<Hotel> getHotelsByCity(String city);
    List<Hotel> getHotelsByMenu(String menuName);
    List<Hotel> getHotelsByDelivery(String partnerName);
    List<Hotel> getHotelsByDeliveryLocation(String location);
    List<Hotel> getHotelsByLocationAndMenu(String location, String menuName);

}
