package org.sid.airtrafficcontrolbackend.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("2DP")
public class TwoDPosition extends Position{
    @ManyToOne
    @JoinColumn(name="carte_Id")
    private Carte carte;
}
