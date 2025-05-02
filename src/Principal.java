import Modelos.Filme;
import Modelos.Serie;
import Modelos.Titulo;

public class Principal {
    public static void main (String[] args) {
        Titulo titulo = new Titulo ();
        Serie serie = new Serie ();
        Filme filme = new Filme ();


        filme.setNotaUm (1);
        filme.setNotaDois (3);
        filme.setNotaTres (6);

        filme.setNome ("HarryPotter");
        filme.exibeFichaTecnica ();


        serie.setNome ("Frieren");
        serie.setAnoDeLancamento ( 2020 );
        serie.setDuracaoEmMinutos ( 20 );
        serie.setTemporadas ( 1 );

        serie.exibeFichaTecnica ();

    }
}
