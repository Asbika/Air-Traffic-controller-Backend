package org.sid.airtrafficcontrolbackend.dtos;

import lombok.Data;
import org.sid.airtrafficcontrolbackend.entities.ThreeDPosition;
import org.sid.airtrafficcontrolbackend.enums.TypeAvion;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
@Data
public class AvionDto {
    private int id;
    private int consommation;
    private int capaciteCarburant;
    @Enumerated(EnumType.STRING)
    private TypeAvion typeAvion;
    private ThreeDPosition threeDpOsition;
}
