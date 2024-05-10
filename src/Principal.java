import com.alura.screenmatch.modelos.Pelicula;
import com.alura.screenmatch.modelos.Series;

public class Principal {
    public static void main(String[] args){

        Pelicula miPelicula = new Pelicula();

        miPelicula.setNombre("Matrix");
        miPelicula.setFecLanzamiento(1998);
        miPelicula.setDuracionMinutos(120);
        miPelicula.setPlanIncluido(true);
        miPelicula.evaluacion(5);

        miPelicula.fichaTecnica();

        Series miSerie = new Series();
        miSerie.setNombre("Friends");
        miSerie.setFecLanzamiento(2001);
        miSerie.setDuracionMinutos(11);
        miSerie.setPlanIncluido(false);


        miSerie.fichaTecnica();
    }
}
