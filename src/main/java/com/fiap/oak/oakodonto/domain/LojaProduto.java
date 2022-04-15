package com.fiap.oak.oakodonto.domain;

import com.fiap.oak.oakodonto.domain.embeddable.LojaProdutoId;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@IdClass(LojaProdutoId.class)
@Entity(name="LOJA_PRODUTO")
public class LojaProduto implements Serializable {

    @Id
    @Column(name="LOJA_ID")
    private Long idLoja;
    @Id
    @Column(name="PRODUTO_ID")
    private Long idProduto;

    @Column(name="VALOR")
    private Double valor;




}
