package org.sid.airtrafficcontrolbackend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorValue("3DP")
public class ThreeDPosition extends Position{
    private Double z;
}
