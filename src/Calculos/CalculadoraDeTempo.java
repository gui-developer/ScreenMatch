package Calculos;

import Modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal ;

    public int getTempoTotal () {
        return this.tempoTotal;
    }

    public void calculaLista (Titulo addLista ){
        this.tempoTotal += addLista.getDuracaoEmMinutos ();
    }

}
