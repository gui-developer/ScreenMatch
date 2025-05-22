package Modelos;

import Interfaces.Classificavel;

public class Filme extends Titulo implements Classificavel {

    //constructor
    public Filme (String nomeFilme, int anoDeLancamento, int minutos) {
        this.setNome ( nomeFilme );
        this.setAnoDeLancamento ( anoDeLancamento );
        this.setDuracaoEmMinutos ( minutos );
    }

    @Override
    public void exibeFichaTecnica () {
        System.out.println ("Nome do filme: "+getNome ());
        System.out.println ("Nota Final: "+somaDasAvaliacoes());
        System.out.println ("Duração: "+getDuracaoEmMinutos ());
    }

    @Override
    public int getClassificacao () {
        return 0;
    }

    @Override
    public String toString () {
        return "Nome : "+ getNome ();
    }
}
