package com.api.vehiclerental.repositories;

import com.api.vehiclerental.models.Customer;
import com.api.vehiclerental.models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface CustomerRepository  extends JpaRepository<Customer, Integer> {
    Optional<Customer> findByEmail(String email);
}
