package com.algaworks.algafood.domain.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@Entity
public class Restaurante {

    @Id
    private Long id;

    private String nome;

    private BigDecimal taxaFrete;

}
