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
    private Integer id;
    private String descricao;
    private Double valor;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "RELATION_1",
    joinColumns = {@JoinColumn(name="LOJA_ID")},
    inverseJoinColumns = {@JoinColumn(name="PRODUTO_ID")})
    private List<Loja> lojas;

}
