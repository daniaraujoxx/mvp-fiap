package com.fiap.oak.oakodonto.domain;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@SequenceGenerator(name = "produto")
public class Produto {

    @Id
    private Long id;
    private String descricao;
    private Double valor;

    @ManyToOne
    private Loja loja;
}
