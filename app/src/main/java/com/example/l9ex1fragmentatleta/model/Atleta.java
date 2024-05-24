package com.example.l9ex1fragmentatleta.model;

import androidx.annotation.NonNull;

import java.time.LocalDate;

public abstract class Atleta {

    private String nome;
    private String dataNasc;
    private String bairro;

    public Atleta(String nome, String dataNasc, String bairro) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.bairro = bairro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @NonNull
    @Override
    public String toString() {
        return "Atleta{" +
                "nome='" + nome + '\'' +
                ", dataNasc=" + dataNasc +
                ", bairro='" + bairro + '\'' +
                '}';
    }
}
