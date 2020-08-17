package com.hotelapp.repository;

import com.hotelapp.models.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryRepository extends JpaRepository<Delivery, Integer> {

    //DerivedQueries
    Delivery findByPartnersName(String partnerName);
}
