package org.unir.calculadora.data.model;

import jakarta.persistence.*;
import lombok.*;
import org.unir.calculadora.data.utils.Consts;

import java.util.ArrayList;
import java.util.UUID;

@Entity
@Table(name = Consts.OPERATION_TABLE)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Operacion {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = Consts.RESULT)
    private float result;

    @ElementCollection(fetch = FetchType.EAGER)
    private ArrayList<Float> operands;
}
