import com.alura.screenmatch.calculos.FiltroRecomendacion;
import com.alura.screenmatch.modelos.Episodio;
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

        Series friends = new Series();
        friends.setNombre("Friends");
        friends.setFecLanzamiento(2001);
        friends.setTemporadas(10);
        friends.setEpisodioByTemporada(24);
        friends.setMinutosByEpisodio(22);
        friends.evaluacion(4.5);
        friends.evaluacion(4.5);
        friends.evaluacion(4.5);
        friends.evaluacion(4.5);
        friends.setPlanIncluido(false);

        friends.fichaTecnicaSeries();

        Titulo otraPelicula = new Titulo();
        otraPelicula.setNombre("Constantine");
        otraPelicula.setFecLanzamiento(2005);
        otraPelicula.setDuracionMinutos(121);
        otraPelicula.setPlanIncluido(true);
        otraPelicula.evaluacion(5);

        otraPelicula.fichaTecnicaPelicula();

        TiempoCalculado calculaTiempos = new TiempoCalculado();
        calculaTiempos.incluyeTiempos(miPelicula);
        calculaTiempos.incluyeTiempos(friends);
        calculaTiempos.incluyeTiempos(otraPelicula);

        calculaTiempos.tiempos();

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

//        Clasificando eclipse = new Episodio();
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("El piloto");
        episodio.setSeries(friends);
        episodio.setTotalVisualizaciones(300);
        filtroRecomendacion.filtra(episodio);



    }

}
