package com.example.chambre;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@AllArgsConstructor
@RequestMapping("chambre")
public class ChambreController {
    private final ChambreService chambreService ;

    @GetMapping
    public List<Chambre> getAllChambre() {
        return chambreService.getAllChambre();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Chambre> getChambreById(@PathVariable Long id) {
        Optional<Chambre> chambreOptional = chambreService.getChambreById(id);

        return chambreOptional.map(chambre -> {
            return new ResponseEntity<>(chambre, HttpStatus.OK);
        }).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Chambre> saveChambre(@RequestBody Chambre chambre) {

        chambreService.saveChambre(chambre);

        return new ResponseEntity<>(chambre, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Chambre> updateChambre(@PathVariable("id") Long id, @RequestBody Chambre chambre) {
        chambreService.updateChambre(id, chambre);
        return new ResponseEntity<Chambre>(chambre, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteChambre(@PathVariable Long id) {
        try {
            chambreService.deleteChambre(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
