package org.sid.airtrafficcontrolbackend.repositories;

import org.sid.airtrafficcontrolbackend.entities.Carte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarteRepository extends JpaRepository<Carte,Integer> {
}
