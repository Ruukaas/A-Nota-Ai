/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ANotaAi.model;

import java.util.List;

/**
 *
 * @author euluc
 */
public class Produto {
    private int codigo;
    private String nome;
    private List<Preço> historicoDeValores;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Preço> getHistoricoDeValores() {
        return historicoDeValores;
    }

    public void setHistoricoDeValores(List<Preço> historicoDeValores) {
        this.historicoDeValores = historicoDeValores;
    }
}
