package org.sid.airtrafficcontrolbackend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.airtrafficcontrolbackend.enums.TypePerturbation;

import javax.persistence.*;
import java.io.Serializable;
 @Entity
 @Data
 @NoArgsConstructor
 @AllArgsConstructor
public class Perturbation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

     @Enumerated(EnumType.STRING)
     private TypePerturbation typePerturbation;

     @OneToOne
     @JoinColumn(name="Position_Id")
     private Position position;

}
