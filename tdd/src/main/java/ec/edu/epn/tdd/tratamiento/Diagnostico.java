package ec.edu.epn.tdd.tratamiento;

import jdk.jshell.Diag;

import java.util.ArrayList;

public class Diagnostico implements Tratamiento {

    private String idDiagnostico;

    private String fecha;

    private String procedimientoDiagnostico;

    private String prescripcionDiagnostico;

    private boolean comprobarIdDiagnostico;

    private String tipoDiagnostico = "Diagnostico";

    ArrayList<Diagnostico> listaDiagnostico = new ArrayList<>();

    ValidacionDatos validador = new ValidacionDatos();

    public Diagnostico(){}

    public Diagnostico(String idDiagnostico, String procedimientoDiagnostico, String prescripcionDiagnostico, String fecha) {
        this.idDiagnostico = idDiagnostico;
        this.fecha = fecha;
        this.procedimientoDiagnostico = procedimientoDiagnostico;
        this.prescripcionDiagnostico = prescripcionDiagnostico;
        this.comprobarIdDiagnostico = true;
    }

    @Override
    public String registrarTratamiento(String idDiagnostico, String procedimientoDiagnostico, String prescripcionDiagnostico){
        this.idDiagnostico = idDiagnostico;
        this.procedimientoDiagnostico = procedimientoDiagnostico;
        this.prescripcionDiagnostico = prescripcionDiagnostico;
        return "Diagnostico Registrado";
    }

    @Override
    public String actualizarTratamiento(String idDiagnostico, String nuevoProcedimientoDiagnostico, String fecha){
        for(Diagnostico d : listaDiagnostico){
            if(d.getIdDiagnostico().equals(idDiagnostico) && d.getFecha().equals(fecha)){
                d.setProcedimientoDiagnostico(nuevoProcedimientoDiagnostico);
            }
        }
        return "Diagnostico Actualizado";
    }

    @Override
    public String actualizarPrescripcionTratamiento(String idDiagnostico, String nuevaPrescripcionDiagnostico, String fecha){
        for(Diagnostico d : listaDiagnostico){
            if(d.getIdDiagnostico().equals(idDiagnostico) && d.getFecha().equals(fecha)){
                d.setPrescripcionDiagnostico(nuevaPrescripcionDiagnostico);
            }
        }
        return "Prescripcion de Diagnostico Actualizada";
    }

    @Override
    public Boolean existeTratamiento(String id, String fecha){
        Boolean resultado = false;
        for(Diagnostico d : listaDiagnostico){
            if(d.getIdDiagnostico().equals(id) && d.getFecha().equals(fecha)){
                resultado = true;
            }
        }
        //return null;
        return  resultado;
    }

    public String getIdDiagnostico() {
        return idDiagnostico;
    }

    public void setIdDiagnostico(String idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }

    public String getProcedimientoDiagnostico() {
        return procedimientoDiagnostico;
    }

    public void setProcedimientoDiagnostico(String procedimientoDiagnostico) {
        this.procedimientoDiagnostico = procedimientoDiagnostico;
    }

    public String getPrescripcionDiagnostico() {
        return prescripcionDiagnostico;
    }

    public void setPrescripcionDiagnostico(String prescripcionDiagnostico) {
        this.prescripcionDiagnostico = prescripcionDiagnostico;
    }

    public boolean isComprobarIdDiagnostico() {
        return comprobarIdDiagnostico;
    }

    public void setComprobarIdDiagnostico(boolean comprobarIdDiagnostico) {
        this.comprobarIdDiagnostico = comprobarIdDiagnostico;
    }

    public ArrayList<Diagnostico> getListaDiagnostico() {
        for(Diagnostico d : listaDiagnostico) {
            if (d.isComprobarIdDiagnostico()) {
                d.registrarTratamiento(d.getIdDiagnostico(), d.getProcedimientoDiagnostico(), d.getPrescripcionDiagnostico());
            }
        }
        return listaDiagnostico;
    }

    public void setListaDiagnostico(ArrayList<Diagnostico> listaDiagnostico) {
        this.listaDiagnostico = listaDiagnostico;
    }

    public String getTipoDiagnostico() {
        return tipoDiagnostico;
    }

    public void setTipoDiagnostico(String tipoDiagnostico) {
        this.tipoDiagnostico = tipoDiagnostico;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return /*"\n "+ "\t" + "Diagnostico:" +*/ "\n"
                + "ID Diagnostico: " + idDiagnostico + "\t - \t"
                + "Procedimiento Diagnostico: " + procedimientoDiagnostico + "\t - \t"
                + "PrescripcionDiagnostico: " + prescripcionDiagnostico + "\t - \t"
                + "Fecha:" + fecha + "\n";
    }
}
