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
public class HerkkuTest {

    private Herkku herkku;

    public HerkkuTest() {
    }

    @Before
    public void setUp() {
        herkku = new Herkku(21, 21);
    }

    @Test
    public void setXToimii() {
        herkku.setX(32);
        assertEquals(32, herkku.getX());
    }

    @Test
    public void setYToimii() {
        herkku.setY(32);
        assertEquals(32, herkku.getY());
    }

}
