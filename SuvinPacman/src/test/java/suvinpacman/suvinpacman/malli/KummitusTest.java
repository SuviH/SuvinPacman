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
public class KummitusTest {

    private Kummitus huhuu;

    public KummitusTest() {
    }

    @Before
    public void setUp() {
        this.huhuu = new Kummitus(1, 1);
    }

    @Test
    public void testiKummitusSetSuunta() {
        huhuu.setSuunta(Hahmo.SUUNTA.YLOS);
        assertEquals(Hahmo.SUUNTA.YLOS, huhuu.getSuunta());
    }

    @Test
    public void testiKummitusXKoordinaatinAsettaminenToimii() {
        assertEquals(1, huhuu.getX());
    }

    @Test
    public void testiKummitusYKoordinaatinAsettaminenToimii() {
        assertEquals(1, huhuu.getY());
    }

    @Test
    public void kummituksenLiikkuminenToimiiYAkseli() {
        huhuu.setSuunta(Hahmo.SUUNTA.ALAS);
        huhuu.liiku(new Kentta());
        assertEquals(2, huhuu.getY());
    }

    @Test
    public void kummituksenLiikkuminenToimiiXAkseli() {
        huhuu.setSuunta(Hahmo.SUUNTA.OIKEA);
        huhuu.liiku(new Kentta());
        assertEquals(2, huhuu.getX());
    }

}
