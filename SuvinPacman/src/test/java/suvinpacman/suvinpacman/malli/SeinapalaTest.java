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
public class SeinapalaTest {

    private Seinapala pala;

    public SeinapalaTest() {
    }

    @Before
    public void setUp() {
        pala = new Seinapala(0, 0, 10, 10);
    }

    @Test
    public void testiSeinaSetX() {
        pala.setX(2);
        assertEquals(2, pala.getX());
    }

    @Test
    public void testiSeinaSetY() {
        pala.setY(2);
        assertEquals(2, pala.getY());
    }

    @Test
    public void testiSeinaSetX2() {
        pala.setX2(2);
        assertEquals(2, pala.getX2());
    }

    @Test
    public void testiSeinaSetY2() {
        pala.setY2(2);
        assertEquals(2, pala.getY2());
    }
}
