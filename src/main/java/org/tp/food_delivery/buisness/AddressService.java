package org.tp.food_delivery.buisness;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.tp.food_delivery.buisness.dao.AddressDAO;
import org.tp.food_delivery.domain.Address;
import org.tp.food_delivery.domain.exception.NotFoundException;

import java.util.Optional;

@Service
@AllArgsConstructor
@Slf4j
public class AddressService {
    private final AddressDAO addressDAO;

    @Transactional
    Address saveAddress(Address address) {
        return addressDAO.saveAddress(address);
    }

    public Address findById(Integer addressId) {
        Optional<Address> address = addressDAO.findById(addressId);
        if (address.isEmpty()) {
            throw new NotFoundException("Could not find address by Id: [%s]".formatted(addressId));
        }
        return address.get();
    }
}
