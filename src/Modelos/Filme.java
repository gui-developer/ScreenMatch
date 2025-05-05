package Modelos;

import Calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {

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
}
