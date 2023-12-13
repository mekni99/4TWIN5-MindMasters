package com.universite.universite.Services;

import com.universite.universite.Entities.Universite;
import com.universite.universite.Interfaces.IUniversite;
import com.universite.universite.Repositories.UniversiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UniversiteImp implements IUniversite {

    @Autowired
    private UniversiteRepository universiteRepository;

    @Override
    public List<Universite> getAll() {
        return universiteRepository.findAll();
    }

    @Override
    public Optional<Universite> getUniversiteById(Long id) {
        return universiteRepository.findById(id);
    }

    @Override
    public void saveUniversite(Universite universite) {
        universiteRepository.save(universite);
    }

    @Override
    public void updateUniversite(Long id, Universite updatedUniversite) {
        Universite existingUniversite = universiteRepository.findById(id).orElse(null);

        if (existingUniversite != null) {
            existingUniversite.setNomUniversite(updatedUniversite.getNomUniversite());
            existingUniversite.setAdresse(updatedUniversite.getAdresse());

            universiteRepository.save(existingUniversite);
        } else {
            throw new IllegalArgumentException("Universite with ID " + id + " does not exist.");
        }
    }


    @Override
    public void deleteUniversite(Long universiteId) {
        Universite universite = universiteRepository.findById(universiteId).orElse(null);

        if (universite != null) {
            universiteRepository.delete(universite);
        } else {
            throw new IllegalArgumentException("Universite with ID " + universiteId + " does not exist.");
        }
    }
}