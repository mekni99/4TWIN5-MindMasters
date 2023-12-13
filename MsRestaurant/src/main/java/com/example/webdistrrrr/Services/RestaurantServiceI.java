package com.example.webdistrrrr.Services;

import com.example.webdistrrrr.entities.Restaurant;

import java.util.List;

public interface RestaurantServiceI {
    List<Restaurant> getAll();
    Restaurant getRestaurantById(Long idRestaurant);
    void saveRestaurant(Restaurant restaurant);
    void updateRestaurant(Long idRestaurant, Restaurant restaurant);
    void deleteRestaurant(Long idRestaurant);
}
