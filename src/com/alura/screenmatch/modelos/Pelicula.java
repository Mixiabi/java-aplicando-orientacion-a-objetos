package com.alura.screenmatch.modelos;
import com.alura.screenmatch.calculos.Clasificando;

public class Pelicula extends Titulo implements Clasificando {
    private String filmDirector;

    public String getFilmDirector() {
        return filmDirector;
    }

    public void setFilmDirector(String filmDirector) {
        this.filmDirector = filmDirector;
    }

//REFUNDICION o CASTEO
    @Override
    public int getClasificando(){
        return (int) (mediaPuntuaciones()/2);
    }
}
