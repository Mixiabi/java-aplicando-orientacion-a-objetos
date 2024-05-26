package com.alura.screenmatch.calculos;

public class FiltroRecomendacion {
    public void filtra(Clasificando clasificando){
        if (clasificando.getClasificando() >= 4){
            System.out.println("Buena eleccion");
        } else if (clasificando.getClasificando() <=2) {
            System.out.println("Popular momentaneamente");
        }else {
            System.out.println("Colocalo en tu lista para verlo despues");
        }
    }
}
