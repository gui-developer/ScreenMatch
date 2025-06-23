package Principal;

import Modelos.Filme;
import Modelos.Serie;
import Modelos.Titulo;

import java.util.*;

public class Listas {
    public static void main (String[] args) {

        Filme novoFilme = new Filme (
                "Clube da Luta",
                2014,
                200);

        //filme
        Filme filme = new Filme (
                "HarryPotter",
                2020,
                230);


        //serie
        Serie serie = new Serie (
                "Frieren",
                true ,
                3,
                10);


        //serie.exibeFichaTecnica ();
        List<Titulo> lista = new LinkedList<> ();
        lista.add ( filme );
        lista.add ( novoFilme );
        lista.add ( serie );

        for (Titulo item : lista){ // para cada item das lista
            System.out.println (item.getNome ());
        }


        Collections.sort (lista); //
        System.out.println (lista);

        //lista.sort ( Comparator.comparing ( Titulo::getAnoDeLancamento ) ); // ordenando pelo ano de lançamento
        System.out.println (lista);

    }
}
