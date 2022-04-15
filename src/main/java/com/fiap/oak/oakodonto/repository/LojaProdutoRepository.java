package com.fiap.oak.oakodonto.repository;

import com.fiap.oak.oakodonto.domain.LojaProduto;
import com.fiap.oak.oakodonto.domain.embeddable.LojaProdutoId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LojaProdutoRepository extends JpaRepository<LojaProduto, LojaProdutoId> {
}
