package com.hotelapp.repository;

import com.hotelapp.models.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HotelRepository extends JpaRepository<Hotel, Integer> {

   List<Hotel> findByAddressCity(String city);
   List<Hotel> findByAddressStreetName(String streetName);

   @Query("FROM Hotel h inner join h.menuList mn where mn.menuName=?1")
   List<Hotel> getHotelsByMenuName(String name);

   @Query("From Hotel h inner join h.delivery dl where dl.partnersName=?1")
   List<Hotel> getHotelsByDelivery(String partnersName);
}
