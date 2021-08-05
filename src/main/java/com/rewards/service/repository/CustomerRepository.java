package com.rewards.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rewards.service.model.CustomerRewards;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerRewards, Integer>{

}
