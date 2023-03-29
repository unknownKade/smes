package com.example.smes.inventory.repository;

import com.example.smes.inventory.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, String> {
    public Inventory getInventoryById(Long id);
}
