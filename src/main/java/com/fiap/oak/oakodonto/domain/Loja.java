package com.fiap.oak.oakodonto.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@SequenceGenerator(name = "loja", sequenceName = "SQ_LOJA", allocationSize = 1)
public class Loja {

    @Id
    private Integer id;
    private String nome;
    private String path;
    @ManyToMany(mappedBy="lojas")
    private List<Produto> produtos;


}
