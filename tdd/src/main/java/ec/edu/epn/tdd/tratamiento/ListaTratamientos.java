package ec.edu.epn.tdd.tratamiento;

import jdk.jshell.Diag;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class ListaTratamientos {

    Tratamiento t; //no sirve

    ArrayList listaTratamientos[] = new ArrayList[4];

    //ArrayList<Tratamiento> lista = new ArrayList();
    Diagnostico diagnostico = new Diagnostico();
    Periodoncia periodoncia = new Periodoncia();
    Ortodoncia ortodoncia = new Ortodoncia();
    Endodoncia endodoncia = new Endodoncia();

    public ListaTratamientos(){
        this.listaTratamientos[0] = diagnostico.getListaDiagnostico();
        this.listaTratamientos[1] = periodoncia.getListaPeriodoncia();
        this.listaTratamientos[2] = ortodoncia.getListaOrtodoncias();
        this.listaTratamientos[3] = endodoncia.getListaEndodoncias();

    }

    public void anadirTratamiento(String idTratamiento, String tipoTratamiento){
        if(tipoTratamiento.equals(diagnostico.getTipoDiagnostico())) {
            this.listaTratamientos[0] = diagnostico.getListaDiagnostico();
        }else if (tipoTratamiento.equals(periodoncia.getTipoPeriodoncia())) {
            this.listaTratamientos[1] = periodoncia.getListaPeriodoncia();
        }
        else if (tipoTratamiento.equals(ortodoncia.getTipoOrtodoncia())) {
            this.listaTratamientos[2] = ortodoncia.getListaOrtodoncias();
        }
        else if (tipoTratamiento.equals(endodoncia.getTipoEndodoncia())) {
            this.listaTratamientos[3] = endodoncia.getListaEndodoncias();
        }
    }


    @Override
    public String toString() {
        return "ListaTratamientos" + Arrays.toString(listaTratamientos) ;
    }
}
