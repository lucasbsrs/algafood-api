package com.algaworks.algafood.domain.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class Cozinha {

    @Id
    private Long id;

    private String nome;

}
