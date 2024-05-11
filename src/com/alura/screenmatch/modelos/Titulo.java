package com.alura.screenmatch.modelos;

public class Titulo {
    private String nombre;
    private int fecLanzamiento;
    private int duracionMinutos;
    private boolean planIncluido;
    private double sumaPuntuaciones;
    private int totalPuntuaciones;


    //////////////////////////////////////////////////////////////////
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /////////////////////////////////////////////////////////////////
    public int getFecLanzamiento() {
        return fecLanzamiento;
    }
    public void setFecLanzamiento(int fecLanzamiento) {
        this.fecLanzamiento = fecLanzamiento;
    }
    ///////////////////////////////////////////////////////////////////////
    public int getDuracionMinutos() {
        return duracionMinutos;
    }
    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }
    /////////////////////////////////////////////////////////////////////////
    public boolean getPlanIncluido() {
        return planIncluido;
    }
    public void setPlanIncluido(boolean planIncluido) {
        this.planIncluido = planIncluido;
    }








    /**
     /////////////////////////////////////////////////////////////////////
     //    public double getSumaPuntuaciones() {
     //        return sumaPuntuaciones;
     //    }
     ////////////////////////////////////////////////////////////////////
     //    public int getTotalPuntuaciones(){
     //        return totalPuntuaciones;
     //    }
     /////////////////////////////////////////////////////////////////////
     */

    public void fichaTecnica(){
        System.out.printf("""
                \nPelicula: %s
                Año de Lanzamiento: %d
                Duracion: %d
                Incluido en el Plan: %b
                Puntuacion total: %.1f \n
                """,
                getNombre(),
                getFecLanzamiento(),
                getDuracionMinutos(),
                getPlanIncluido(),
                mediaPuntuaciones());
    }


    public void evaluacion(double nota){

        sumaPuntuaciones = sumaPuntuaciones + nota;
        totalPuntuaciones++;
    }

    double mediaPuntuaciones(){
        return sumaPuntuaciones/totalPuntuaciones;

    }
}
