package com.example.microService.Controller;

import com.example.microService.Entities.Equipement;

import com.example.microService.Interfaces.IEquipement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/equipement")
public class EquipementController {

    @Autowired
    private IEquipement equipementService;



    @GetMapping
    public List<Equipement> getAllEquipements(@RequestParam(required = false) String sortOrder) {
        Sort.Direction direction = Sort.Direction.ASC; // Default sorting direction

        if (sortOrder != null && sortOrder.equalsIgnoreCase("desc")) {
            direction = Sort.Direction.DESC;
        }

        Sort sort = Sort.by(direction, "prixEquipement"); // Replace "yourSortingField" with the actual field to sort by

        return equipementService.getAllEquipements(sort);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Equipement> getEquipementById(@PathVariable Long id) {
        Optional<Equipement> equipement = equipementService.getEquipementById(id);
        return equipement.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Equipement saveEquipement(@RequestBody Equipement equipement) {
        return equipementService.saveEquipement(equipement);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Equipement> updateEquipement(@PathVariable Long id, @RequestBody Equipement updatedEquipement) {
        Equipement updated = equipementService.updateEquipement(id, updatedEquipement);
        return updated != null ? ResponseEntity.ok(updated) : ResponseEntity.notFound().build();
    }
    @DeleteMapping("/{id}")
    public void deleteEquipement(@PathVariable Long id) {
        equipementService.deleteEquipement(id);
    }



}
