import com.alura.screenmatch.modelos.Series;
import com.alura.screenmatch.modelos.Titulo;
import com.alura.screenmatch.calculos.TiempoCalculado;
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
        nuevaSerie.evaluacion(4.5);
        nuevaSerie.setPlanIncluido(false);

        nuevaSerie.fichaTecnicaSeries();

        Titulo otraPelicula = new Titulo();
        otraPelicula.setNombre("Constantine");
        otraPelicula.setFecLanzamiento(2005);
        otraPelicula.setDuracionMinutos(121);
        otraPelicula.setPlanIncluido(true);
        otraPelicula.evaluacion(5);

        otraPelicula.fichaTecnicaPelicula();

        TiempoCalculado calculaTiempos = new TiempoCalculado();
        calculaTiempos.incluyeTiempos(miPelicula);
        calculaTiempos.incluyeTiempos(nuevaSerie);
        calculaTiempos.incluyeTiempos(otraPelicula);

        calculaTiempos.tiempos();
    }

}
