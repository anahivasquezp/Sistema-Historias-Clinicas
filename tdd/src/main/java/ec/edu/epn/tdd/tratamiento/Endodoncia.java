package ec.edu.epn.tdd.tratamiento;

import java.util.ArrayList;

public class Endodoncia implements Tratamiento{
    private String idEndodoncia;

    private String fecha;

    private String procedimientoEndodoncia;
    private String prescripcionEndodoncia;

    private boolean comprobarIdEndodoncia;

    private String tipoEndodoncia = "Endodoncia";

    ArrayList<Endodoncia> listaEndodoncias = new ArrayList<>();

    ValidacionDatos validador = new ValidacionDatos();

    public Endodoncia() {
    }

    public Endodoncia(String idEndodoncia, String procedimientoEndodoncia, String prescripcionEndodoncia, String fecha) {
        this.idEndodoncia = idEndodoncia;
        this.procedimientoEndodoncia = procedimientoEndodoncia;
        this.prescripcionEndodoncia = prescripcionEndodoncia;
        this.comprobarIdEndodoncia = true;
        this.fecha = fecha;
    }


    @Override
    public String registrarTratamiento(String idEndodoncia, String procedimientoEndodoncia, String prescripcionEndodoncia){
        this.idEndodoncia = idEndodoncia;
        this.procedimientoEndodoncia = procedimientoEndodoncia;
        this.prescripcionEndodoncia= prescripcionEndodoncia;
        this.comprobarIdEndodoncia = false;
        return "Endodoncia Registrada";
        //return null;
    }

    @Override
    public String actualizarTratamiento(String idEndodoncia, String nuevoProcedimientoEndodoncia, String fecha){
        for(Endodoncia e : listaEndodoncias){
            if(e.getIdEndodoncia().equals(idEndodoncia) && e.getFecha().equals(fecha)){
                e.setProcedimientoEndodoncia(nuevoProcedimientoEndodoncia);
            }
        }
        return "Endodoncia Actualizada";
    }

    @Override
    public String actualizarPrescripcionTratamiento(String idEndodoncia, String nuevaPrescripcionEndodoncia, String fecha){
        for(Endodoncia e : listaEndodoncias){
            if(e.getIdEndodoncia().equals(idEndodoncia) && e.getFecha().equals(fecha)){
                e.setPrescripcionEndodoncia(nuevaPrescripcionEndodoncia);
            }
        }
        return "Prescripcion de Endodoncia Actualizada";
    }

    @Override
    public Boolean existeTratamiento(String id, String fecha){
        Boolean resultado = false;
        for(Endodoncia e : listaEndodoncias){
            if(e.getIdEndodoncia().equals(id) && e.getFecha().equals(fecha)){
                resultado = true;
            }
        }
        //return null;
        return  resultado;
    }

    public String getIdEndodoncia() {
        return idEndodoncia;
    }

    public void setIdEndodoncia(String idEndodoncia) {
        this.idEndodoncia = idEndodoncia;
    }

    public String getProcedimientoEndodoncia() {
        return procedimientoEndodoncia;
    }

    public void setProcedimientoEndodoncia(String procedimientoEndodoncia) {
        this.procedimientoEndodoncia = procedimientoEndodoncia;
    }

    public String getPrescripcionEndodoncia() {
        return prescripcionEndodoncia;
    }

    public void setPrescripcionEndodoncia(String prescripcionEndodoncia) {
        this.prescripcionEndodoncia = prescripcionEndodoncia;
    }

    public boolean isComprobarIdEndodoncia() {
        return comprobarIdEndodoncia;
    }

    public void setComprobarIdEndodoncia(boolean comprobarIdEndodoncia) {
        this.comprobarIdEndodoncia = comprobarIdEndodoncia;
    }

    public ArrayList<Endodoncia> getListaEndodoncias(){
        for(Endodoncia e : listaEndodoncias) {
            if (e.isComprobarIdEndodoncia()) {
                e.registrarTratamiento(e.getIdEndodoncia(), e.getProcedimientoEndodoncia(), e.getPrescripcionEndodoncia());
            }
        }
        return listaEndodoncias;
    }

    public void setListaEndodoncias(ArrayList<Endodoncia> listaEndodoncias) {
        this.listaEndodoncias = listaEndodoncias;
    }

    public String getTipoEndodoncia() {
        return tipoEndodoncia;
    }

    public void setTipoEndodoncia(String tipoEndodoncia) {
        this.tipoEndodoncia = tipoEndodoncia;
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
                + "ID Endodoncia: " + idEndodoncia + "\t - \t"
                + "Procedimiento Endodoncia: " + procedimientoEndodoncia + "\t - \t"
                + "Prescripcion Endodoncia: " + prescripcionEndodoncia + "\t - \t"
                + "Fecha:" + fecha + "\n";
    }
}
