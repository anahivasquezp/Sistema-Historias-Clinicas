package ec.edu.epn.tdd.tratamiento;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)

public class DiagnosticoTest {

    private String idDiagnostico, fechaDiagnostico;
    private boolean expected;

    @Parameterized.Parameters
    public static Iterable<Object[]> parameters(){
        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{"1752413268", "12/12/12",true});
        return objects;
    }

    public DiagnosticoTest(String idDiagnostico, String fechaDiagnostico, Boolean expected) {
        this.idDiagnostico = idDiagnostico;
        this.fechaDiagnostico = fechaDiagnostico;
        this.expected = expected;
    }

    //assert con parametros 1
    @Test
    public void existeTratamiento(){
        Diagnostico d = new Diagnostico();
        d.listaDiagnostico.add(new Diagnostico("1752413268", "Revision Bucal", "Lavarse los dientes", "12/12/12"));
        Boolean resultado = d.existeTratamiento(idDiagnostico,fechaDiagnostico);
        assertEquals(expected,resultado);
    }


    //mock 1
    @Test
    public void actualizarTratamiento() {
        Diagnostico d = Mockito.mock(Diagnostico.class);
        Mockito.when(d.actualizarTratamiento("1752413268","Revisar Piezas Superiores, Revisar Piezas Inferiores", "01/01/2022")).thenReturn("Diagnostico Actualizado");

        assertEquals("Diagnostico Actualizado", d.actualizarTratamiento("1752413268","Revisar Piezas Superiores, Revisar Piezas Inferiores", "01/01/2022"));
        }


    //mock 2
    @Test
    public void actualizarPrescripcionTratamiento() {
        Diagnostico d = Mockito.mock(Diagnostico.class);
        Mockito.when(d.actualizarPrescripcionTratamiento("1752413268","Asistir a la siguiente cita para finalizar revision", "01/01/2022")).thenReturn("Prescripcion de Diagnostico Actualizada");

        assertEquals("Prescripcion de Diagnostico Actualizada", d.actualizarPrescripcionTratamiento("1752413268","Asistir a la siguiente cita para finalizar revision", "01/01/2022"));
    }
}