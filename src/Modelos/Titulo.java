package Modelos;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {
    @SerializedName ("Title")
    private String nome;
    //@SerializedName ("Year")
    private int anoDeLancamento;
    private boolean incluidoNoPlano ;
    private double somaDasAvaliacoes ;
    //@SerializedName ( "Runtime" )
    private int duracaoEmMinutos ;
    private int totalVisualizacoes;


    int notaUm;
    int notaDois;
    int notaTres;

    public Titulo (TituloAPI tituloAPI) {
        this.nome = tituloAPI.title ();
        this.anoDeLancamento = Integer.valueOf ( tituloAPI.year () );
        this.duracaoEmMinutos = Integer.valueOf ( tituloAPI.runtime ().substring ( 0,2 ) );
    }

    public Titulo () {

    }


    //metodos
    public void exibeFichaTecnica(){
        System.out.println ("Nome do filme: "+nome);
        System.out.println ("Nota Final: "+somaDasAvaliacoes());
        System.out.println ("Temporadas:");
        System.out.println ("Duração: "+duracaoEmMinutos);
    }

    public int somaDasAvaliacoes(){
      return (notaUm + notaDois + notaTres) / 3;
    }

    //getters

    public int getNotaUm () {
        return notaUm;
    }

    public int getNotaDois () {
        return notaDois;
    }

    public int getNotaTres () {
        return notaTres;
    }


    public String getNome () {
        return nome;
    }

    public int getAnoDeLancamento () {
        return anoDeLancamento;
    }

    public double getSomaDasAvaliacoes () {
        return somaDasAvaliacoes;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public int getDuracaoEmMinutos () {
        return duracaoEmMinutos;
    }

    public int getTotalDeVisualizacoes () {
        return totalVisualizacoes;
    }


    //Setters
    public void setNotaUm (int notaUm) {
        this.notaUm = notaUm;
    }

    public void setNotaDois (int notaDois) {
        this.notaDois = notaDois;
    }

    public void setNotaTres (int notaTres) {
        this.notaTres = notaTres;
    }

    public void setAnoDeLancamento (int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean isIncluidoNoPlano () {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano (boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setSomaDasAvaliacoes (double somaDasAvaliacoes) {
        this.somaDasAvaliacoes = somaDasAvaliacoes;
    }

    public void setDuracaoEmMinutos (int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setTotalDeVisualizacoes (int totalDeVisualizacoes) {
        this.totalVisualizacoes = totalDeVisualizacoes;
    }

    public int getClassificacao(){
        if (totalVisualizacoes > 100){
            return 4;
        }else {
            return 2;
        }
    }

//comparando titulos para ordenar em ordem alfabetica no collections.sort
    @Override
    public int compareTo (Titulo outroTitulo) {
        return this.getNome ().compareTo ( outroTitulo.getNome () );
    }

    @Override
    public String toString () {
        return "Titulo{" +
                "Nome:'" + nome + '\'' +
                ", Ano de lancamento:" + anoDeLancamento +
                ", Duracao em minutos:" + duracaoEmMinutos +
                '}';
    }
}


