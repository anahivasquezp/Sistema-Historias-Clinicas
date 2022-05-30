package ec.edu.epn.tdd.tratamiento;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class EndodonciaTest {

    Endodoncia e1 = new Endodoncia();
    ArrayList<Endodoncia> listaEndodonciasTest = new ArrayList<>();

    @Before
    public void setUp(){
        e1.setComprobarIdEndodoncia(true);
        e1.registrarTratamiento("1752413268", "Extraccion","Tratar Inflamaciones");
        listaEndodonciasTest.add(e1);
        e1.setListaEndodoncias(listaEndodonciasTest);
    }

    //test unitario 6: assert null
    @Test
    public void given_endodontics_when_id_is_null() {
        Endodoncia e = new Endodoncia();
        assertNull(e.getIdEndodoncia());
    }

    //test unitario 7: assert not null
    @Test
    public void given_endodontics_when_id_is_not_null() {
        Endodoncia e = new Endodoncia();
        e.setIdEndodoncia("1752413268");
        assertNotNull(e.getIdEndodoncia());
    }

    //test unitario 8: assert array equals
    @Test
    public void given_Endodoncia_when_array_is_null() {

        Object[] expected = new Object[]{e1};
        Object[] actual = e1.getListaEndodoncias().toArray();
        assertArrayEquals(expected, actual);
    }
}