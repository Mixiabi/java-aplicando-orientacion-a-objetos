package com.alura.screenmatch.calculos;
import com.alura.screenmatch.modelos.Titulo;


public class TiempoCalculado {

    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluyeTiempos(Titulo titulo){
        this.tiempoTotal = tiempoTotal + titulo.getDuracionMinutos();
    }

    public void tiempos(){
        System.out.printf("tiempo total para ver toda tu lista: %d \n" ,getTiempoTotal());
    }
}
