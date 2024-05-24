package com.example.l9ex1fragmentatleta.model;

import androidx.annotation.NonNull;

public class Juvenil extends Atleta{

    private int anos;

    public Juvenil(String nome, String dataNasc, String bairro, int anos) {
        super(nome, dataNasc, bairro);
        this.anos = anos;
    }

    public int getAnos() {
        return anos;
    }

    public void setAnos(int anos) {
        this.anos = anos;
    }

    @NonNull
    @Override
    public String toString() {
        return "Atleta Juvenil{" +
                "nome='" + getNome() + '\'' +
                "anos=" + anos +
                '}';
    }
}
