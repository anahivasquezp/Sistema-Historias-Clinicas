package ec.edu.epn.tdd.tratamiento;

import java.util.ArrayList;

public class Ortodoncia implements Tratamiento{

    private String idOrtodoncia;

    private String fecha;

    private String procedimientoOrtodoncia;
    private String prescripcionOrtodoncia;

    private boolean comprobarIdOrtodoncia;

    private String tipoOrtodoncia = "Ortodoncia";

    ArrayList<Ortodoncia> listaOrtodoncias = new ArrayList<>();

    ValidacionDatos validador = new ValidacionDatos();

    public Ortodoncia() {
    }

    public Ortodoncia(String idOrtodoncia, String procedimientoOrtodoncia, String prescripcionOrtodoncia, String fecha) {
        this.idOrtodoncia = idOrtodoncia;
        this.procedimientoOrtodoncia = procedimientoOrtodoncia;
        this.prescripcionOrtodoncia = prescripcionOrtodoncia;
        this.comprobarIdOrtodoncia = true;
        this.fecha = fecha;
    }


    @Override
    public String registrarTratamiento(String idOrtodoncia, String procedimientoOrtodoncia, String prescripcionOrtodoncia){
        this.idOrtodoncia = idOrtodoncia;
        this.procedimientoOrtodoncia = procedimientoOrtodoncia;
        this.prescripcionOrtodoncia= prescripcionOrtodoncia;
        this.comprobarIdOrtodoncia = false;
        return "Ortodoncia Registrada";
        //return null;
    }

    @Override
    public String actualizarTratamiento(String idOrtodoncia, String nuevoProcedimientoOrtodoncia, String fecha){
        for(Ortodoncia o : listaOrtodoncias){
            if(o.getIdOrtodoncia().equals(idOrtodoncia) && o.getFecha().equals(fecha)){
                o.setProcedimientoOrtodoncia(nuevoProcedimientoOrtodoncia);
            }
        }
        return "Ortodoncia Actualizada";
    }

    @Override
    public String actualizarPrescripcionTratamiento(String idOrtodoncia, String nuevaPrescripcionOrtodoncia, String fecha){
        for(Ortodoncia o : listaOrtodoncias){
            if(o.getIdOrtodoncia().equals(idOrtodoncia) && o.getFecha().equals(fecha)){
                o.setPrescripcionOrtodoncia(nuevaPrescripcionOrtodoncia);
            }
        }
        return "Prescripcion de Ortodoncia Actualizada";
    }

    @Override
    public Boolean existeTratamiento(String id, String fecha){
        Boolean resultado=false;
        for(Ortodoncia o : listaOrtodoncias){
            if(o.getIdOrtodoncia().equals(id) && o.getFecha().equals(fecha)){
                resultado = true;
            }
        }
        //return null;
        return  resultado;
    }

    public String getIdOrtodoncia() {
        return idOrtodoncia;
    }

    public void setIdOrtodoncia(String idOrtodoncia) {
        this.idOrtodoncia = idOrtodoncia;
    }

    public String getProcedimientoOrtodoncia() {
        return procedimientoOrtodoncia;
    }

    public void setProcedimientoOrtodoncia(String procedimientoOrtodoncia) {
        this.procedimientoOrtodoncia = procedimientoOrtodoncia;
    }

    public String getPrescripcionOrtodoncia() {
        return prescripcionOrtodoncia;
    }

    public void setPrescripcionOrtodoncia(String prescripcionOrtodoncia) {
        this.prescripcionOrtodoncia = prescripcionOrtodoncia;
    }

    public boolean isComprobarIdOrtodoncia() {
        return comprobarIdOrtodoncia;
    }

    public void setComprobarIdOrtodoncia(boolean comprobarIdOrtodoncia) {
        this.comprobarIdOrtodoncia = comprobarIdOrtodoncia;
    }

    public ArrayList<Ortodoncia> getListaOrtodoncias() {
        for(Ortodoncia o : listaOrtodoncias) {
            if (o.isComprobarIdOrtodoncia()) {
                o.registrarTratamiento(o.getIdOrtodoncia(), o.getProcedimientoOrtodoncia(), o.getPrescripcionOrtodoncia());
            }
        }
        return listaOrtodoncias;
    }

    public void setListaOrtodoncias(ArrayList<Ortodoncia> listaOrtodoncias) {
        this.listaOrtodoncias = listaOrtodoncias;
    }

    public String getTipoOrtodoncia() {
        return tipoOrtodoncia;
    }

    public void setTipoOrtodoncia(String tipoOrtodoncia) {
        this.tipoOrtodoncia = tipoOrtodoncia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
         return /*"\n "+ "\t" + "Diagnostico:" */ "\n"
                + "ID Ortodoncia: " + idOrtodoncia + "\t - \t"
                + "Procedimiento Ortodoncia: " + procedimientoOrtodoncia + "\t - \t"
                + "Prescripcion Ortodoncia: " + prescripcionOrtodoncia + "\t - \t"
                + "Fecha:" + fecha + "\n";
    }
}
