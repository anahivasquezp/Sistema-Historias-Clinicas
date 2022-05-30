package ec.edu.epn.tdd.tratamiento;

import org.junit.Test;

import static org.junit.Assert.*;

public class OrtodonciaTest {

    //test unitario 3: assert true
    @Test
    public void given_orthodontics_when_existeIdOrtodoncia_is_true() {
        Ortodoncia o = new Ortodoncia();
        o.setComprobarIdOrtodoncia(true);
        o.setIdOrtodoncia("1713074050");
        o.setFecha("10/01/2022");
        assertTrue(o.existeTratamiento("1713074050","10/01/2022"));
    }

    //test unitario 4: assert false
    @Test
    public void given_orthodontics_when_existeIdOrtodoncia_is_false() {
        Ortodoncia o = new Ortodoncia();
        //o.setComprobarIdOrtodoncia(false);
        assertFalse(o.existeTratamiento(o.getIdOrtodoncia(),o.getFecha()));
    }

    //test unitario 5: assert equals
    @Test
    public void given_orthodontics_when_ids_are_the_same() {
        Ortodoncia o1 = new Ortodoncia();
        Ortodoncia o2 = new Ortodoncia();
        o1.registrarTratamiento("1752413268", "Estudio","Limpiar bien los aparatos");
        o2.registrarTratamiento("1752413268", "Correcion","Utilizar Cepillo intradental");
        assertEquals("Ortodoncia Actualizada",o1.getIdOrtodoncia(), o2.getIdOrtodoncia());
    }


}