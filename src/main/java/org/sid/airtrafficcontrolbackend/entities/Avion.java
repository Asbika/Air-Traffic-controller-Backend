package org.sid.airtrafficcontrolbackend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.airtrafficcontrolbackend.enums.TypeAvion;
import javax.persistence.*;
import java.util.Collection;
import org.sid.airtrafficcontrolbackend.entities.ThreeDPosition;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Avion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int consommation;
    private int capaciteCarburant;

    @Enumerated(EnumType.STRING)
    private TypeAvion typeAvion;

    @OneToOne
    @JoinColumn(name="ThreeDposition_Id")
    private ThreeDPosition threeDpOsition;

    @OneToMany(mappedBy = "avion",fetch = FetchType.LAZY)
    private Collection<Vol> vols;
}
