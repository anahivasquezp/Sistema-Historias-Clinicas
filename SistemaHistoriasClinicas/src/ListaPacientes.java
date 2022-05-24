import java.util.ArrayList;

public class ListaPacientes {

    ArrayList<Paciente> lista = new ArrayList();
    Paciente paciente = new Paciente();

    public ListaPacientes() {
    }

    public void anadirPaciente(Paciente paciente){
        this.lista.add(paciente);
    }

    public boolean existePaciente(String cedula){
        boolean respuesta = false;
        for(Paciente paciente : lista){
            if (paciente.getNumeroCedula().equals(cedula)) {
                respuesta = true;
                break;
            }
        }
        return respuesta;
    }


    //METODO PARA CONSULTAR PACIENTE MEDIANTE SU NUMERO DE CEDULA
    public Paciente consultarPaciente(String cedula) {
        for (int i = 0; i < lista.size(); i++) {
            if ((lista.get(i).getNumeroCedula()).equals(cedula)) {
                return lista.get(i);
            }
        }
        return null;
    }

    //METODO PARA ACTUALIZAR DIRECCION
    public String actualizarDireccion (String cedula, String nuevaDireccion){
        for(Paciente paciente : lista){
            if (paciente.getNumeroCedula().equals(cedula)) {
                System.out.println("Informacion antigua: \n" + paciente.toString());
                paciente.setDireccionDomiciliaria(nuevaDireccion);
                return "La direccion del paciente ha sido actualizada\n" + paciente.toString();
            }
        }
        return null;
    }

    //METODO PARA ACTUALIZAR TELEFONO
    public String actualizarTelefono (String cedula, String nuevoTelefono){
        for(Paciente paciente : lista){
            if (paciente.getNumeroCedula().equals(cedula)) {
                System.out.println("Informacion antigua: \n" + paciente.toString());
                paciente.setTelefonoPaciente(nuevoTelefono);
                return "El telefono del paciente ha sido actualizada\n" + paciente.toString();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Pacientes: \n" + lista;
    }
}






















