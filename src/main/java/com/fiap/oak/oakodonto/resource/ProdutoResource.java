package com.fiap.oak.oakodonto.resource;

import com.fiap.oak.oakodonto.domain.Produto;
import com.fiap.oak.oakodonto.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoResource {

    @Autowired
    ProdutoRepository repository;

    @GetMapping("/{descricao}")
    public List<Produto> findAllProdDesc(@PathVariable String descricao){
        return repository.findByDescricaoContainingIgnoreCase(descricao);
    }

    @GetMapping
    public List<Produto> findAllProd(){
        return repository.findAll();
    }

    @PostMapping
    public Produto createProduto(@RequestBody Produto produto){
        return repository.save(produto);
    }


}
