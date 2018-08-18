package com.boot.repository;

import com.boot.model.Shipwreck;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipWreckRepository extends JpaRepository<Shipwreck, Long> {
}
