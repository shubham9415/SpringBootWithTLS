package com.hotelapp;

import com.hotelapp.constants.DeliveryPartners;
import com.hotelapp.models.Address;
import com.hotelapp.models.Delivery;
import com.hotelapp.models.Hotel;
import com.hotelapp.models.Menu;
import com.hotelapp.service.DeliveryService;
import com.hotelapp.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class SpringHotelappRestapiApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringHotelappRestapiApplication.class, args);
	}

	@Autowired
	HotelService hotelService;

	@Autowired
	DeliveryService deliveryService;

	@Override
	public void run(String... args) throws Exception {
		/*Address address = new Address("Jalandhar", "Amritsar Road",144402, "Punjab");
		Menu menu1 = new Menu("Tikki",80);
		Menu menu2 = new Menu("Pakoda",20);
		Set<Menu> menuSet = new HashSet<>(Arrays.asList(menu1,menu2));
		Delivery delivery1 = deliveryService.getDeliveryByPartnerName(DeliveryPartners.Swiggy.toString());
		Delivery delivery2 = deliveryService.getDeliveryByPartnerName(DeliveryPartners.Zomato.toString());
		Set<Delivery> deliveryPartners = new HashSet<>(Arrays.asList(delivery1,delivery2));
		Hotel hotel = new Hotel("The Havelli", address,menuSet,deliveryPartners);
		hotelService.addHotel(hotel);

		Hotel hotel1 =hotelService.getHotelById(1652);
		System.out.println(hotel1);
		hotel1.getAddress().setCity("Faridabad");
		hotelService.updateHotel(hotel1);
		Hotel hotel2 =hotelService.getHotelById(1652);
		System.out.println(hotel2);
*/
		/*hotelService.getHotelsByCity("NOIDA").stream().forEach(System.out::println);-*/
		/*hotelService.getHotelsByMenu("Paratha").stream().forEach(h->System.out.println(h.getHotelName() + h.getDelivery()));

		hotelService.getHotelsByDelivery(DeliveryPartners.Swiggy.toString()).stream().forEach(h->System.out.println(h.getHotelName()));*/

	}
}

