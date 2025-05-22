import Calculos.FiltroRecomendacao;
import Interfaces.Classificavel;
import Modelos.Episodio;
import Modelos.Filme;
import Modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main (String[] args) {

        //filme
        Filme filme = new Filme (
                "HarryPotter",
                2020,
                230);
        filme.setNotaUm (1);
        filme.setNotaDois (3);
        filme.setNotaTres (6);
        filme.setDuracaoEmMinutos ( 150 );
        filme.exibeFichaTecnica ();


        Filme novoFilme = new Filme (
                "Clube da Luta",
                2014,
                200);


        //serie
        Serie serie = new Serie ();
        serie.setNome ("Frieren");
        serie.setAnoDeLancamento ( 2020 );
        serie.setDuracaoEmMinutos ( 20 );
        serie.setTemporadas ( 1 );
        serie.exibeFichaTecnica ();





        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra ( filme );

        Episodio episodio = new Episodio ();
        episodio.setNome ( "Piloto" );
        episodio.setNumero ( 1 );
        episodio.setSerie ( "How I met Your Mother" );
        episodio.setTotalVisualizacoes(100);
        filtro.filtra (episodio);

        ArrayList<Filme> listaDeFilmes = new ArrayList<> ();
        listaDeFilmes.add ( filme );
        listaDeFilmes.add ( novoFilme );

        System.out.println (listaDeFilmes.toString ());

    }
}
