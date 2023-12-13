package com.example.microService.Interfaces;

import com.example.microService.Entities.Equipement;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface IEquipement {
    List<Equipement> getAllEquipements();
    Optional<Equipement> getEquipementById(Long id);
    Equipement saveEquipement(Equipement equipement);
    Equipement updateEquipement(Long id, Equipement updatedEquipement);

    void deleteEquipement(Long id);

    List<Equipement> getAllEquipements(Sort sort);
}
