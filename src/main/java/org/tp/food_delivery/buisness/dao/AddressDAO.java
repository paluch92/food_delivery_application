package org.tp.food_delivery.buisness.dao;

import org.tp.food_delivery.domain.Address;

import java.util.Optional;

public interface AddressDAO {
    Address saveAddress(Address address);

    Optional<Address> findById(Integer addressId);
}
