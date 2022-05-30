package ec.edu.epn.tdd.tratamiento;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)

public class PeriodonciaTest {

    private String idPeriodoncia, fechaPeriodoncia;
    private boolean expected;

    @Parameterized.Parameters
    public static Iterable<Object[]> parameters(){
        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{"1712198900", "10/10/10",true});
        return objects;
    }

    public PeriodonciaTest(String idPeriodoncia, String fechaPeriodoncia, Boolean expected) {
        this.idPeriodoncia = idPeriodoncia;
        this.fechaPeriodoncia = fechaPeriodoncia;
        this.expected = expected;
    }

    //assert con parametros 2
    @Test
    public void existeTratamiento(){
        Periodoncia p = new Periodoncia();
        p.listaPeriodoncia.add(new Periodoncia("1712198900", "Revision Bucal", "Lavarse los dientes", "10/10/10"));
        Boolean resultado = p.existeTratamiento(idPeriodoncia,fechaPeriodoncia);
        assertEquals(expected,resultado);
    }

    //test unitario 1: assert same
    @Test
    public void given_two_periodontics_when_ids_are_the_same() {
        Periodoncia p1 = new Periodoncia();
        Periodoncia p2 = new Periodoncia();
        p1.registrarTratamiento("1752413268", "Chequeo de encias superiores","Buena Higiene");
        p2.registrarTratamiento("1752413268", "Chequeo de encias inferiores","Buena Higiene");
        assertSame(p2.getIdPeriodoncia(),p1.getIdPeriodoncia());
    }


    //test unitario 2: assert not same
    @Test
    public void given_two_periodontics_when_ids_are_not_the_same() {
        Periodoncia p1 = new Periodoncia();
        Periodoncia p2 = new Periodoncia();
        p1.registrarTratamiento("1752413268", "Chequeo de encias superiores","Buena Higiene");
        p2.registrarTratamiento("1713074051", "Chequeo de encias inferiores","Buena Higiene");
        assertNotSame(p2.getIdPeriodoncia(),p1.getIdPeriodoncia());
    }
}