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
    public void testiAlussaHerkkujaEiOle() {
        assertTrue(kentta.onkoKaikkiHerkutSyoty());
    }

    @Test
    public void testiKummituksiaLisataanKolme() {
        assertEquals(3, kentta.getKummitukset().size());
    }

    @Test
    public void testiHerkkujenLisaysOnnistuu() {
        kentta.lisaaHerkut();
        assertFalse(kentta.onkoKaikkiHerkutSyoty());
    }

    @Test
    public void testiHerkkujenLisaysLisaaKymmenen() {
        kentta.lisaaHerkut();
        assertEquals(10, kentta.getHerkut().size());
    }

}
