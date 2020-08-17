package com.hotelapp.service;

import com.hotelapp.models.Hotel;
import com.hotelapp.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    HotelRepository hotelRepository;

    @Override
    public Hotel addHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public void updateHotel(Hotel hotel) {
        hotelRepository.save(hotel);
    }

    @Override
    public Hotel getHotelById(int id) {
        return hotelRepository.findById(id).get();
    }

    @Override
    public void deleteHotel(int hotelId) {
        hotelRepository.deleteById(hotelId);
    }

    @Override
    public List<Hotel> getHotelsByCity(String city) {
        return hotelRepository.findByAddressCity(city);
    }

    @Override
    public List<Hotel> getHotelsByMenu(String menuName) {

        return hotelRepository.getHotelsByMenuName(menuName);
    }

    @Override
    public List<Hotel> getHotelsByDelivery(String partnerName) {
        return hotelRepository.getHotelsByDelivery(partnerName);
    }

    @Override
    public List<Hotel> getHotelsByDeliveryLocation(String location) {
        return hotelRepository.findByAddressStreetName(location);
    }

    @Override
    public List<Hotel> getHotelsByLocationAndMenu(String location, String menuName) {
        return null;
    }
}
