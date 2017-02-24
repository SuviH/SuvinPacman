/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suvinpacman.suvinpacman.malli;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author suvi
 */
public class KenttaTest {

    private Kentta kentta;

    public KenttaTest() {
    }

    @Before
    public void setUp() {
        kentta = new Kentta();
    }

    @Test
    public void testiOnkoHerkutSyotyTrue() {
        kentta.getHerkut().clear();
        assertTrue(kentta.onkoKaikkiHerkutSyoty());
    }

    @Test
    public void testiKummituksiaLisataanKymmenen() {
        assertEquals(10, kentta.getKummitukset().size());
    }

    @Test
    public void testiOnkoHerkutSyotyFalse() {

        assertFalse(kentta.onkoKaikkiHerkutSyoty());
    }

    @Test
    public void testiHerkkujenLisaysOnnistuu() {

        assertEquals(165, kentta.getHerkut().size());
    }

    @Test
    public void testiOnkoKoordinaatissaSeinaTrue() {
        assertTrue(kentta.onkoKoordinaatissaSeina(1, 1));
    }

    @Test
    public void testiOnkoKoordinaatissaSeinaFalse() {
        assertFalse(kentta.onkoKoordinaatissaSeina(30, 30));
    }

}
