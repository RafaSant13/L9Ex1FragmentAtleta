package com.example.l9ex1fragmentatleta.model;

import androidx.annotation.NonNull;

public class Senior extends Atleta{

    private boolean problema;

    public Senior(String nome, String dataNasc, String bairro, boolean problema) {
        super(nome, dataNasc, bairro);
        this.problema = problema;
    }

    public boolean isProblema() {
        return problema;
    }

    public void setProblema(boolean problema) {
        this.problema = problema;
    }

    @NonNull
    @Override
    public String toString() {
        return "Atleta Sênior{" +
                "nome='" + getNome() + '\'' +
                "problema=" + problema +
                '}';
    }
}
