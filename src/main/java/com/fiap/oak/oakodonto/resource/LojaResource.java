package com.fiap.oak.oakodonto.resource;

import com.fiap.oak.oakodonto.domain.Loja;
import com.fiap.oak.oakodonto.domain.Produto;
import com.fiap.oak.oakodonto.repository.LojaRepository;
import com.fiap.oak.oakodonto.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/loja")
public class LojaResource {

    @Autowired
    LojaRepository repository;

    @GetMapping("/{nome}")
    public List<Loja> findAllLoja(@PathVariable String nome){

        return repository.findByNome(nome);
    }
}
