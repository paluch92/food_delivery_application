package org.tp.food_delivery.infrastuctre.database.repository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.tp.food_delivery.buisness.dao.AddressDAO;
import org.tp.food_delivery.domain.Address;
import org.tp.food_delivery.infrastuctre.database.entity.AddressEntity;
import org.tp.food_delivery.infrastuctre.database.repository.jpa.AddressJpaRepository;
import org.tp.food_delivery.infrastuctre.database.repository.mapper.AddressEntityMapper;

import java.util.Optional;

@Repository
@AllArgsConstructor
public class AddressRepository implements AddressDAO {
    private final AddressJpaRepository addressJpaRepository;

    private final AddressEntityMapper addressEntityMapper;

    @Override
    public Address saveAddress(Address address) {
        AddressEntity toSave = addressEntityMapper.mapToEntity(address);
        AddressEntity saved = addressJpaRepository.save(toSave);
        return addressEntityMapper.mapFromEntity(saved);
    }

    @Override
    public Optional<Address> findById(Integer addressId) {
        return addressJpaRepository.findById(addressId)
                .map(addressEntityMapper::mapFromEntity);
    }
}
