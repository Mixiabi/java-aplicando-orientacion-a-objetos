public class Principal {
    public static void main(String[] args){

        Pelicula miPelicula = new Pelicula();

        miPelicula.nombre = "Matrix";
        miPelicula.fecLanzamiento = 1998;
        miPelicula.duracionMinutos = 120;
        miPelicula.fichaTecnica();
        miPelicula.evaluacion(5);
        miPelicula.evaluacion(2.3);
        miPelicula.evaluacion(6.1);
        miPelicula.evaluacion(4.2);
        miPelicula.evaluacion(1.8);
        System.out.println("Suma de puntuaciones es: " + miPelicula.sumaPuntuaciones);
        System.out.println("Total de puntuaciones es: " + miPelicula.totalPuntuaciones);
        System.out.println("La media de evaluacion es de: " + miPelicula.mediaPuntuaciones());


    }
}
