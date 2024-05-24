package com.example.l9ex1fragmentatleta.model;

public class Outros extends Atleta{

    private String academia;
    private int recorde;

    public Outros(String nome, String dataNasc, String bairro, String academia, int recorde) {
        super(nome, dataNasc, bairro);
        this.academia = academia;
        this.recorde = recorde;
    }

    public String getAcademia() {
        return academia;
    }

    public void setAcademia(String academia) {
        this.academia = academia;
    }

    public int getRecorde() {
        return recorde;
    }

    public void setRecorde(int recorde) {
        this.recorde = recorde;
    }

    @Override
    public String toString() {
        return "Atleta{" +
                "nome='" + getNome() + '\'' +
                "academia='" + academia + '\'' +
                ", recorde=" + recorde +
                '}';
    }
}
