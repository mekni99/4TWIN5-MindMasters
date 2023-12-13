package com.universite.universite.Interfaces;


import com.universite.universite.Entities.Universite;

import java.util.List;

public interface IUniversite {

    List<Universite> getAll();
    Object getUniversiteById(Long id);
    void saveUniversite(Universite eleve);
    void updateUniversite(Long id, Universite eleve);
    void deleteUniversite(Long eleveId);

}
