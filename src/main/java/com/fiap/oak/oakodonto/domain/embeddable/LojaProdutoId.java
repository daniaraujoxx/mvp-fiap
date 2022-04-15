package com.fiap.oak.oakodonto.domain.embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LojaProdutoId implements Serializable {

    private Long idLoja;
    private Long idProduto;

}
