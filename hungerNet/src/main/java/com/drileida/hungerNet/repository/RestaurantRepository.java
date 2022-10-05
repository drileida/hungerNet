package com.drileida.hungerNet.repository;

import com.drileida.hungerNet.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}
