package com.api.crud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.api.crud.model.Produto;

@Service
public class ProdutoService {
    private List<Produto> produtos = new ArrayList<>();
    private Long nextId = 1L;

    public List<Produto> getAllProdutos(){
        return produtos;
    }

    public Produto addProduto(Produto produto){
        produto.setId(nextId++);
        produtos.add(produto);
        return produto;
    }
}
