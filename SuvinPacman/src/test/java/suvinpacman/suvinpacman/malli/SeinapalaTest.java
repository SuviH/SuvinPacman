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

    public SeinapalaTest() {
    }

    @Before
    public void setUp() {
    }

    @Test
    public void testiSeinaSetX() {
        Seinapala pala = new Seinapala();
        pala.setX(2);
        assertEquals(2, pala.getX());
    }

    @Test
    public void testiSeinaSetY() {
        Seinapala pala = new Seinapala();
        pala.setY(2);
        assertEquals(2, pala.getY());
    }
}
