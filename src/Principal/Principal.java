package Principal;

import Calculos.FiltroRecomendacao;
import Modelos.Episodio;
import Modelos.Filme;
import Modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main (String[] args) {






        FiltroRecomendacao filtro = new FiltroRecomendacao();

        Episodio episodio = new Episodio ();
        episodio.setNome ( "Piloto" );
        episodio.setNumero ( 1 );
        episodio.setSerie ( "How I met Your Mother" );
        episodio.setTotalVisualizacoes(100);
        filtro.filtra (episodio);
    }
}
