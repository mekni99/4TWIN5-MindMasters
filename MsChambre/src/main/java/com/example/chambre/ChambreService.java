package com.example.chambre;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
public class ChambreService {
    private ChambreRepository chambreRepository;
    public List<Chambre> getAllChambre() {
        return chambreRepository.findAll();
    }

    public Optional<Chambre> getChambreById(Long id) {
        return chambreRepository.findById(id);
    }

    public void saveChambre(Chambre chambre) {
        chambreRepository.save(chambre);
    }



    public void updateChambre(Long id, Chambre updatedChambre) {
        Chambre existingChambre = chambreRepository.findById(id).orElse(null);

        if (existingChambre != null) {
            existingChambre.setNumeroChambre(updatedChambre.getNumeroChambre());
            existingChambre.setIdChambre(updatedChambre.getIdChambre());

            chambreRepository.save(existingChambre);
        } else {
            throw new IllegalArgumentException("Chambre with ID " + id + " does not exist.");
        }
    }


    public void deleteChambre(Long chambreId) {
        Chambre chambre = chambreRepository.findById(chambreId).orElse(null);

        if (chambre != null) {
            chambreRepository.delete(chambre);
        } else {
            throw new IllegalArgumentException("Chambre with ID " + chambreId + " does not exist.");
        }
    }
}
