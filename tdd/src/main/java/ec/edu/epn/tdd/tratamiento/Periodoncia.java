package ec.edu.epn.tdd.tratamiento;

import java.util.ArrayList;

public class Periodoncia implements Tratamiento{

    private String idPeriodoncia;

    private String fecha;

    private String procedimientoPeriodoncia;
    private String prescripcionPeriodoncia;

    private boolean comprobarIdPeriodoncia;

    private String tipoPeriodoncia = "Periodoncia";

    ArrayList<Periodoncia> listaPeriodoncia = new ArrayList<>();

    ValidacionDatos validador = new ValidacionDatos();

    public Periodoncia() {
    }

    public Periodoncia(String idPeriodoncia, String procedimientoPeriodoncia, String prescripcionPeriodoncia, String fecha) {
        this.idPeriodoncia = idPeriodoncia;
        this.procedimientoPeriodoncia = procedimientoPeriodoncia;
        this.prescripcionPeriodoncia = prescripcionPeriodoncia;
        this.comprobarIdPeriodoncia = true;
        this.fecha = fecha;
    }

    @Override
    public String registrarTratamiento(String idPeriodoncia, String procedimientoPeriodoncia, String prescripcionPeriodoncia){
        this.idPeriodoncia = idPeriodoncia;
        this.procedimientoPeriodoncia = procedimientoPeriodoncia;
        this.prescripcionPeriodoncia = prescripcionPeriodoncia;
        this.comprobarIdPeriodoncia= false;
        return "Periodoncia Registrada";
        //return null;
    }

    @Override
    public String actualizarTratamiento(String idPeriodoncia, String nuevoProcedimientoPeriodoncia, String fecha){
        for(Periodoncia p : listaPeriodoncia){
            if(p.getIdPeriodoncia().equals(idPeriodoncia) && p.getFecha().equals(fecha)){
                p.setProcedimientoPeriodoncia(nuevoProcedimientoPeriodoncia);
            }
        }
        return "Periodoncia Actualizada";
    }

    @Override
    public String actualizarPrescripcionTratamiento(String idPeriodoncia, String nuevaPrescripcionPeriodoncia, String fecha){
        for(Periodoncia p : listaPeriodoncia){
            if(p.getIdPeriodoncia().equals(idPeriodoncia) && p.getFecha().equals(fecha)){
                p.setPrescripcionPeriodoncia(nuevaPrescripcionPeriodoncia);
            }
        }
        return "Prescripcion de Periodoncia Actualizada";
    }

    @Override
    public Boolean existeTratamiento(String id, String fecha){
        Boolean resultado=false;
        for(Periodoncia p : listaPeriodoncia){
            if(p.getIdPeriodoncia().equals(id) && p.getFecha().equals(fecha)){
                resultado = true;
            }
        }
        //return null;
        return  resultado;
    }

    public String getIdPeriodoncia() {
        return idPeriodoncia;
    }

    public void setIdPeriodoncia(String idPeriodoncia) {
        this.idPeriodoncia = idPeriodoncia;
    }

    public String getProcedimientoPeriodoncia() {
        return procedimientoPeriodoncia;
    }

    public void setProcedimientoPeriodoncia(String procedimientoPeriodocia) {
        this.procedimientoPeriodoncia = procedimientoPeriodocia;
    }

    public String getPrescripcionPeriodoncia() {
        return prescripcionPeriodoncia;
    }

    public void setPrescripcionPeriodoncia(String prescripcionPeriodoncia) {
        this.prescripcionPeriodoncia = prescripcionPeriodoncia;
    }

    public boolean isComprobarIdPeriodoncia() {
        return comprobarIdPeriodoncia;
    }

    public void setComprobarIdPeriodoncia(boolean comprobarIdPeriodoncia) {
        this.comprobarIdPeriodoncia = comprobarIdPeriodoncia;
    }

    public ArrayList<Periodoncia> getListaPeriodoncia() {
        for(Periodoncia p : listaPeriodoncia) {
            if (p.isComprobarIdPeriodoncia()) {
                p.registrarTratamiento(p.getIdPeriodoncia(), p.getProcedimientoPeriodoncia(), p.getPrescripcionPeriodoncia());
            }
        }
        return listaPeriodoncia;
    }

    public void setListaPeriodoncia(ArrayList<Periodoncia> listaPeriodoncia) {
        this.listaPeriodoncia = listaPeriodoncia;
    }

    public String getTipoPeriodoncia() {
        return tipoPeriodoncia;
    }

    public void setTipoPeriodoncia(String tipoPeriodoncia) {
        this.tipoPeriodoncia = tipoPeriodoncia;
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
                + "ID Periodoncia: " + idPeriodoncia + "\t - \t"
                + "Procedimiento Periodoncia: " + procedimientoPeriodoncia + "\t - \t"
                + "Prescripcion Periooncia: " + prescripcionPeriodoncia + "\t - \t"
                + "Fecha:" + fecha + "\n";

    }
}
