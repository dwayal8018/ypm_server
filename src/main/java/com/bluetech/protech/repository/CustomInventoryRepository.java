package com.bluetech.protech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bluetech.protech.pojo.ComponentInventory;

public interface CustomInventoryRepository extends JpaRepository<ComponentInventory, Integer> {

}
