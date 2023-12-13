package com.example.microService.Entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Equipement implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long idEquipement;
        String nom;
        private double prixEquipement;
        private int nombreTotal;
}




