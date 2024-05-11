package com.alura.screenmatch.modelos;

public class Series extends Titulo{
    private int temporadas;
    private int episodioByTemporada;
    private int minutosByEpisodio;

    @Override
    public int getDuracionMinutos() {
        return temporadas * episodioByTemporada * minutosByEpisodio;
    }

    @Override
    public void evaluacion(double nota) {
        super.evaluacion(nota);
    }

    @Override
    public double mediaPuntuaciones() {
        return super.mediaPuntuaciones();
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodioByTemporada() {
        return episodioByTemporada;
    }

    public void setEpisodioByTemporada(int episodioByTemporada) {
        this.episodioByTemporada = episodioByTemporada;
    }

    public int getMinutosByEpisodio() {
        return minutosByEpisodio;
    }

    public void setMinutosByEpisodio(int minutosByEpisodio) {
        this.minutosByEpisodio = minutosByEpisodio;
    }

    public void fichaTecnicaSeries(){
        System.out.printf("""
                \nSerie: %s
                Año de Lanzamiento: %d
                Duracion: %d minutos
                Temporadas: %d
                Episodios por Temporada: %d
                Minutos por Episodio: %d
                Incluido en el Plan: %b
                Puntuacion total: %.1f \n
                """,
                getNombre(),
                getFecLanzamiento(),
                getDuracionMinutos(),
                getTemporadas(),
                getEpisodioByTemporada(),
                getMinutosByEpisodio(),
                getPlanIncluido(),
                mediaPuntuaciones());
    }


}







