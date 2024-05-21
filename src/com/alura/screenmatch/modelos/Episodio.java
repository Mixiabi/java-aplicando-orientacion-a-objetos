package com.alura.screenmatch.modelos;

import com.alura.screenmatch.calculos.Clasificando;

public class Episodio implements Clasificando {
    private int numero;
    private String nombre;
    private Series series;
    private int totalVisualizaciones;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    @Override
    public int getClasificando(){
        if (totalVisualizaciones > 100) {
            return 4;
        }else {
            return 2;
        }
    }



}
