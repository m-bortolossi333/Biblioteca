package com.bcopstein.ex1biblioeca;

public class ItemDto {
    private int codigo;
    private String nome;
    
    public ItemDto(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }
    
    public String getNome() {
        return nome;
    }
}
