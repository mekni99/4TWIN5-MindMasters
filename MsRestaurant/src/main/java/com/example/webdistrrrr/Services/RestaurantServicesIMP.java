package com.example.webdistrrrr.Services;

import com.example.webdistrrrr.Repository.RestaurantRepository;
import com.example.webdistrrrr.entities.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class RestaurantServicesIMP implements RestaurantServiceI{

    @Autowired
    private RestaurantRepository restaurantRepository;

    @Override
    public List<Restaurant> getAll() {
        return restaurantRepository.findAll();
    }

    @Override
    public Restaurant getRestaurantById(Long idRestaurant) {
        return restaurantRepository.findRestaurantByIdRestaurant(idRestaurant) ;
    }


    @Override
    public void saveRestaurant(Restaurant restaurant) {
        restaurantRepository.save(restaurant);
    }

    @Override
    public void updateRestaurant(Long idRes, Restaurant restaurant) {
        Restaurant existingrestaurant = restaurantRepository.findById(idRes).orElse(null);

        if (existingrestaurant != null) {
            existingrestaurant.setIdRestaurant(restaurant.getIdRestaurant());
            existingrestaurant.setNomRestaurant(restaurant.getNomRestaurant());


            restaurantRepository.save(existingrestaurant);
        } else {
            throw new IllegalArgumentException("Restaurant with ID " + idRes + " does not exist.");
        }

    }

    @Override
    public void deleteRestaurant(Long idRes) {
        Restaurant restaurant = restaurantRepository.findById(idRes).orElse(null);

        if (restaurant != null) {
            restaurantRepository.delete(restaurant);
        } else {
            throw new IllegalArgumentException("restaurant with ID " + idRes + " does not exist.");
        }
    }

}
