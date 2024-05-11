import com.alura.screenmatch.modelos.Series;
import com.alura.screenmatch.modelos.Titulo;

public class Principal {
    public static void main(String[] args){

        Titulo miPelicula = new Titulo();
        miPelicula.setNombre("Matrix");
        miPelicula.setFecLanzamiento(1998);
        miPelicula.setDuracionMinutos(120);
        miPelicula.setPlanIncluido(true);
        miPelicula.evaluacion(5);
        miPelicula.fichaTecnicaPelicula();


        Series nuevaSerie = new Series();
        nuevaSerie.setNombre("Friends");
        nuevaSerie.setFecLanzamiento(2001);
        nuevaSerie.setTemporadas(10);
        nuevaSerie.setEpisodioByTemporada(24);
        nuevaSerie.setMinutosByEpisodio(22);
        nuevaSerie.evaluacion(10);
        nuevaSerie.setPlanIncluido(false);
        nuevaSerie.fichaTecnicaSeries();
    }
}
