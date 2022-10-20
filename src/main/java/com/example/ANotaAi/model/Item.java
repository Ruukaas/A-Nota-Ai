/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ANotaAi.model;

/**
 *
 * @author euluc
 */
public class Item {
    private int codigo;
    private Produto produto;
    private int quantidade;
    private Preço valorUnitario;
    private Loja localDeVenda;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Preço getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Preço valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Loja getLocalDeVenda() {
        return localDeVenda;
    }

    public void setLocalDeVenda(Loja localDeVenda) {
        this.localDeVenda = localDeVenda;
    }
    
}
