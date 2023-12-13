package tn.esprit.msfoyer;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class FoyerService implements Ifoyer{

    FoyerRepository foyerRepository ;
    @Override
    public List<Foyer> getAllFoyers() {
        return foyerRepository.findAll();
    }

    @Override
    public Optional<Foyer> getFoyerById(Long id) {
        return foyerRepository.findById(id);
    }

    @Override
    public void saveFoyer(Foyer foyer) {
        foyerRepository.save(foyer);
    }

    @Override
    public void updateFoyer(Long id, Foyer updatedFoyer) {
        Foyer existingFoyer = foyerRepository.findById(id).orElse(null);

        if (existingFoyer != null) {
            existingFoyer.setNomFoyer(updatedFoyer.getNomFoyer());
            existingFoyer.setCapaciteFoyer(updatedFoyer.getCapaciteFoyer());
            foyerRepository.save(existingFoyer);
        } else {
            throw new IllegalArgumentException("Foyer with ID " + id + " does not exist.");
        }
    }


    @Override
    public void deleteFoyer(Long foyerId) {
        Foyer foyer = foyerRepository.findById(foyerId).orElse(null);

        if (foyer != null) {
            foyerRepository.delete(foyer);
        } else {
            throw new IllegalArgumentException("Foyer with ID " + foyerId + " does not exist.");
        }
    }
}
