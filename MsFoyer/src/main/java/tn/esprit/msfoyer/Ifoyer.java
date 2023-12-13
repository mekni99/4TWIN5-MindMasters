package tn.esprit.msfoyer;

import java.util.List;
import java.util.Optional;

public interface Ifoyer {
    List<Foyer> getAllFoyers();

    Optional<Foyer> getFoyerById(Long id);

    void saveFoyer(Foyer foyer);

    void updateFoyer(Long id, Foyer updatedFoyer);

    void deleteFoyer(Long foyerId);
}
