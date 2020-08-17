package com.hotelapp.controller;

import com.hotelapp.models.Hotel;
import com.hotelapp.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/hotels-restApi")
public class HotelController {

    @Autowired
    HotelService hotelService;

    @Value("${spring.application.name}")
    public String appName;

    @GetMapping("/")
    public String homePage(Model model){
        model.addAttribute("appName",appName);
        return "home";
    }

    @PostMapping("/hotels")
    public ResponseEntity<Hotel> addHotel(@RequestBody Hotel hotel){
        Hotel hotel1 =hotelService.addHotel(hotel);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("desc", "oneHotelAdded");
        return ResponseEntity.ok().headers(httpHeaders).body(hotel1);
    }

    @PutMapping("/hotels")
    public ResponseEntity<String> updateHotel(Hotel hotel){
        hotelService.updateHotel(hotel);
        return ResponseEntity.ok().body("Updated!");
    }

    @GetMapping("/hotels/hotel-by-id/{hotelId}")
    public ResponseEntity<Hotel> getHotelById(@PathVariable int hotelId){
        Hotel hotel = hotelService.getHotelById(hotelId);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("desc", "Getting one Hotel Instance");
        return ResponseEntity.ok().headers(httpHeaders).body(hotel);
    }

    @DeleteMapping("/hotels/delete-hote-byid/{hotelId}")
    public ResponseEntity<Void> deleteHotel(@PathVariable int hotelId){
        hotelService.deleteHotel(hotelId);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/hotels/hotel-by-city/{cityName}")
    public ResponseEntity<List<Hotel>> getHotelsByCity(@PathVariable("cityName") String city){
        List<Hotel> hotels = hotelService.getHotelsByCity(city);
        return ResponseEntity.ok().body(hotels);
    }
    @GetMapping("/hotels/hotel-by-menu/{menuName}")
    public ResponseEntity<List<Hotel>>getHotelsByMenu(@PathVariable String menuName){
        List<Hotel> hotels = hotelService.getHotelsByMenu(menuName);
        return ResponseEntity.ok().body(hotels);
    }
    @GetMapping("/hotels/hotel-by-partner/{partnerName}")
    public ResponseEntity<List<Hotel>> getHotelsByDelivery(@PathVariable String partnerName){
        List<Hotel> hotels =hotelService.getHotelsByDelivery(partnerName);
        return ResponseEntity.ok().body(hotels);
    }
    @GetMapping("/hotels/hotel-by-street/{streetName}")
    public ResponseEntity<List<Hotel>> getHotelsByDeliveryLocation(@PathVariable("streetName") String location){
        List<Hotel> hotelList = hotelService.getHotelsByDeliveryLocation(location);
        return ResponseEntity.ok().body(hotelList);
    }

    @GetMapping("/hotels/hotel-by-location/{streetName}/hotel-by-menu/{menuName}")
    public ResponseEntity<List<Hotel>> getHotelsByLocationAndMenu(@PathVariable("streetName") String location, @PathVariable String menuName){
        List<Hotel> hotelList = hotelService.getHotelsByLocationAndMenu(location,menuName);
        return ResponseEntity.ok().body(hotelList);
    }

    @RequestMapping(value = "/error")
    public ResponseEntity<String> myError(){
        return ResponseEntity.badRequest().body("No URL Found");
    }
}
