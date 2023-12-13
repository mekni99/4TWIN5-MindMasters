package com.example.microService.Services;


import com.example.microService.Entities.Equipement;
import com.example.microService.Interfaces.IEquipement;
import com.example.microService.Repository.EquipementRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class EquipementImp implements IEquipement {

    private EquipementRepository equipementRepository;

    @Override
    public List<Equipement> getAllEquipements() {
        return equipementRepository.findAll();
    }

    @Override
    public Optional<Equipement> getEquipementById(Long id) {
        return equipementRepository.findById(id);
    }

    @Override
    public Equipement saveEquipement(Equipement equipement) {
        return equipementRepository.save(equipement);
    }
    @Override
    public Equipement updateEquipement(Long id, Equipement updatedEquipement) {
        Optional<Equipement> optionalEquipement = getEquipementById(id);
        if (optionalEquipement.isPresent()) {
            Equipement equipement = optionalEquipement.get();
            equipement.setNom(updatedEquipement.getNom());
            equipement.setPrixEquipement(updatedEquipement.getPrixEquipement());

            return saveEquipement(equipement);
        }
        return null;
    }
    @Override
    public void deleteEquipement(Long id) {
        equipementRepository.deleteById(id);
    }

    @Override
    public List<Equipement> getAllEquipements(Sort sort) {
        return equipementRepository.findAll(sort);
    }
}
