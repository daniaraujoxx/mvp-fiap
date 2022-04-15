package com.fiap.oak.oakodonto.resource;

import com.fiap.oak.oakodonto.domain.Loja;
import com.fiap.oak.oakodonto.domain.LojaProduto;
import com.fiap.oak.oakodonto.repository.LojaProdutoRepository;
import com.fiap.oak.oakodonto.repository.LojaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loja")
public class LojaResource {

    @Autowired
    LojaRepository lojaRepository;

    @Autowired
    LojaProdutoRepository lojaProdutoRepository;

    @GetMapping("/{nome}")
    public List<Loja> findAllLojaByName(@PathVariable String nome){
        return lojaRepository.findByNomeContainingIgnoreCase(nome);
    }

    @GetMapping
    public List<Loja> findAllLoja(){
        return lojaRepository.findAll();
    }

    @PostMapping
    public Loja createLoja(@RequestBody Loja loja){
        return lojaRepository.save(loja);
    }

    @GetMapping("/produtoLoja")
    public List<LojaProduto> findAllLojaProduto(){
        return lojaProdutoRepository.findAll();
    }


}
