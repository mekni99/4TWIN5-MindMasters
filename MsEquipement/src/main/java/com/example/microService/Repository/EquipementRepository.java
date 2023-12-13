package com.example.microService.Repository;

import com.example.microService.Entities.Equipement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipementRepository extends JpaRepository<Equipement,Long> {
}
