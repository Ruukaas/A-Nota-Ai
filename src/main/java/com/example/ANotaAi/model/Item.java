/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ANotaAi.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author euluc
 */

@Entity
public class Item implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    
    @ManyToOne
    private Produto produto;
    private int quantidade;
    
    @OneToOne
    private Preço valorUnitario;
    
    @ManyToOne
    private Loja localDeVenda;
    
    @ManyToOne
    private NotaFiscal notaFiscal;


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
    
    public NotaFiscal getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(NotaFiscal notaFiscal) {
        this.notaFiscal = notaFiscal;
    }
    
}
