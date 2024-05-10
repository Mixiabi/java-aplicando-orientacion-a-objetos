package com.alura.screenmatch.modelos;

public class Series {
    String nombre;
    private int fecLanzamiento;
    private int duracionMinutos;
    private boolean planIncluido;
    private double sumaPuntuaciones;
    private int totalPuntuaciones;

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public int getFecLanzamiento() {
        return fecLanzamiento;
    }

    public void setFecLanzamiento(int fecLanzamiento) {
        this.fecLanzamiento = fecLanzamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getPlanIncluido() {
        return planIncluido;
    }

    public void setPlanIncluido(boolean planIncluido) {
        this.planIncluido = planIncluido;
    }

    public void fichaTecnica(){
        System.out.printf("""
                \nPelicula: %s
                Año de Lanzamiento: %d
                Duracion: %d
                Incluido en el Plan: %b \n
                """, getNombre(), getFecLanzamiento(), getDuracionMinutos(), getPlanIncluido());
//
//        Puntuacion total: %.1f
    }

    public void evaluacion(double nota){

        sumaPuntuaciones = sumaPuntuaciones + nota;
        totalPuntuaciones++;
    }


}
