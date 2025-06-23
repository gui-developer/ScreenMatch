package Modelos;

public class Serie extends Titulo {
    private int quantidadeDeEpisodios;
    private int temporadas ;
    private boolean continuaAtiva;

    Titulo titulo = new Titulo ();



    public Serie (String titulo, boolean continuaAtiva, int temporadas, int quantidadeDeEpisodios) {
        this.setNome ( titulo );
        this.continuaAtiva = continuaAtiva;
        this.temporadas = temporadas;
        this.quantidadeDeEpisodios = quantidadeDeEpisodios;
    }

    //getters
    public int getTemporadas () {
        return temporadas;
    }

    public Titulo getTitulo () {
        return titulo;
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

    @Override
    public String toString () {
        return getNome ();
    }
}
