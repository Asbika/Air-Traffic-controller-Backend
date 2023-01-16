package org.sid.airtrafficcontrolbackend.repositories;

import org.sid.airtrafficcontrolbackend.entities.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionRepository extends JpaRepository<Position,Integer> {
}
