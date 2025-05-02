package Modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano ;
    private double somaDasAvaliacoes ;
    private int duracaoEmMinutos ;


    int notaUm;
    int notaDois;
    int notaTres;





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


}
