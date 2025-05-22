package Modelos;

import Interfaces.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalVisualizacoes;

    public int getTotalVisualizacoes () {
        return totalVisualizacoes;
    }

    public void setTotalVisualizacoes (int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    public int getNumero () {
        return numero;
    }
    public String getNome () {
        return nome;
    }
    public Serie getSerie () {
        return serie;
    }


    public void setNumero (int numero) {
        this.numero = numero;
    }
    public void setNome (String nome) {
        this.nome = nome;
    }
    public void setSerie (String serie) {
       return;
    }

    @Override
    public int getClassificacao () {
        return 0;
    }
}
