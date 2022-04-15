package com.fiap.oak.oakodonto.repository;

import com.fiap.oak.oakodonto.domain.Loja;
import com.fiap.oak.oakodonto.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LojaRepository extends JpaRepository<Loja, Integer> {

    List<Loja> findByNomeContainingIgnoreCase(String nome);

}
