package com.example.webdistrrrr.Repository;

import com.example.webdistrrrr.entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant,Long> {
    Restaurant findRestaurantByIdRestaurant(Long idRestaurant);
}
