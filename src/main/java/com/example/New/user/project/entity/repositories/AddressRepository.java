package com.example.New.user.project.entity.repositories;

import com.example.New.user.project.entity.Address;
import org.hibernate.mapping.Table;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {

}
