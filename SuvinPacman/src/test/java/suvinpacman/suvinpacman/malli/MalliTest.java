/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suvinpacman.suvinpacman.malli;

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
public class MalliTest {

    private Malli malli;

    public MalliTest() {
    }

    @Before
    public void setUp() {
        this.malli = new Malli();

    }

    @Test
    public void pelinTilaAluksiAloitus() {
        assertTrue(malli.getTila() == Malli.PelinTila.ALOITUS);
    }

    @Test
    public void kenttaEiOleNull() {
        assertTrue(malli.getKentta() != null);
    }

    /**
     * Test of vaihdaPelinTila method, of class Malli.
     */
    @Test
    public void testVaihdaPelinTila() {
        malli.vaihdaPelinTila(Malli.PelinTila.PELI);
        assertTrue(malli.getTila() == Malli.PelinTila.PELI);
    }

}
