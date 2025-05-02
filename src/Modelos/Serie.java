package Modelos;

public class Serie extends Titulo {
    private int quantidadeDeEpisodios;
    private int temporadas ;
    private boolean continuaAtiva;

    Titulo titulo = new Titulo ();


    //getters
    public int getTemporadas () {
        return temporadas;
    }

    public int getQuantidadeDeEpisodios () {
        return quantidadeDeEpisodios;
    }

    //setters
    public void setTemporadas (int temporadas) {
        this.temporadas = temporadas;
    }

    public void setQuantidadeDeEpisodios (int quantidadeDeEpisodios) {
        this.quantidadeDeEpisodios = quantidadeDeEpisodios;
    }

    @Override
    public int getDuracaoEmMinutos () {
        return  quantidadeDeEpisodios * temporadas * titulo.getDuracaoEmMinutos();
    }

}
