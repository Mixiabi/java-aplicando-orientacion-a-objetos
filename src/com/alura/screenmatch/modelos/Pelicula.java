public class Pelicula {
    String nombre;
    int fecLanzamiento;
    int duracionMinutos;
    boolean planIncluido;
    private double sumaPuntuaciones;
    private int totalPuntuaciones;

    int getTotalPuntuaciones(){
        return totalPuntuaciones;
    }

    void fichaTecnica(){
        System.out.println("Pelicula: " + nombre);
        System.out.println("Año de fecLanzamiento: " + fecLanzamiento);
        System.out.println("Incluido en el Plan: " + planIncluido);
    }

    void evaluacion(double nota){

        sumaPuntuaciones = sumaPuntuaciones + nota;
        totalPuntuaciones++;
    }

    double mediaPuntuaciones(){
        return sumaPuntuaciones/totalPuntuaciones;

    }
}