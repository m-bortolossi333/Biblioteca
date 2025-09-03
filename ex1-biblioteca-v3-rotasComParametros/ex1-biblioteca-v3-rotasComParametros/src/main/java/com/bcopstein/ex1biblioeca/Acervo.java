package com.bcopstein.ex1biblioeca;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Acervo {
    private List<Livro> livros;

    public Acervo(){
        livros = new LinkedList<>();

        livros.add(new Livro(10, "Introdução ao Java", "Huguinho Pato", 2022));
        livros.add(new Livro(20, "Introdoção ao Spring-Boot", "Zezinho Pato", 2020));
        livros.add(new Livro(15, "Principios SOLID", "Luizinho Pato", 2023));
        livros.add(new Livro(17, "PAdroes de Projeto", "Lala PAto", 2019));

    }

    public List<Livro> getAll(){
        return livros;
    }

    public List<String> getTitulos(){
        return livros.stream()
        .map(livro->livro.getTitulo())
        .toList();
    }
    
}
