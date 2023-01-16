package org.sid.airtrafficcontrolbackend.repositories;

import org.sid.airtrafficcontrolbackend.entities.Trajet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrajetRepository extends JpaRepository<Trajet,Integer> {
}
