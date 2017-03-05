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
        this.huhuu = new Kummitus(21, 21);
    }

    @Test
    public void testiKummitusSetSuunta() {
        huhuu.setSuunta(Hahmo.SUUNTA.YLOS);
        assertEquals(Hahmo.SUUNTA.YLOS, huhuu.getSuunta());
    }

    @Test
    public void testiKummitusSaaKonstruktorissaSuunnan() {
        assertTrue(huhuu.getSuunta() != null);
    }

    @Test
    public void testiKummitusXKoordinaatinAsettaminenToimii() {
        assertEquals(21, huhuu.getX());
    }

    @Test
    public void testiKummitusYKoordinaatinAsettaminenToimii() {
        assertEquals(21, huhuu.getY());
    }

    @Test
    public void kummituksenLiikkuminenToimiiYlos() {
        huhuu.setSuunta(Hahmo.SUUNTA.YLOS);
        huhuu.setX(22);
        huhuu.liiku(new Kentta());
        assertEquals(21, huhuu.getY());
    }

    @Test
    public void kummituksenLiikkuminenToimiiAlas() {
        huhuu.setSuunta(Hahmo.SUUNTA.ALAS);
        huhuu.liiku(new Kentta());
        assertEquals(22, huhuu.getY());
    }

    @Test
    public void kummituksenLiikkuminenToimiiOikealle() {
        huhuu.setSuunta(Hahmo.SUUNTA.OIKEA);
        huhuu.liiku(new Kentta());
        assertEquals(22, huhuu.getX());
    }

    @Test
    public void kummituksenLiikkuminenToimiiVasemmalle() {
        huhuu.setSuunta(Hahmo.SUUNTA.VASEN);
        huhuu.setX(22);
        huhuu.liiku(new Kentta());
        assertEquals(21, huhuu.getX());
    }

    @Test
    public void uudenSuunnanArpominenToimii() {
        Hahmo.SUUNTA suunta = huhuu.getSuunta();
        huhuu.arvoUusiSuunta();
        assertTrue(suunta != huhuu.getSuunta());
    }

    @Test
    public void kummitusVaihtaaSuuntaaKunTormaaSeinaanYlos() {
        huhuu.setSuunta(Hahmo.SUUNTA.YLOS);
        huhuu.liiku(new Kentta());
        assertFalse(Hahmo.SUUNTA.YLOS == huhuu.getSuunta());
    }

    @Test
    public void kummitusVaihtaaSuuntaaKunTormaaSeinaanVasen() {
        huhuu.setSuunta(Hahmo.SUUNTA.VASEN);
        huhuu.liiku(new Kentta());
        assertFalse(Hahmo.SUUNTA.VASEN == huhuu.getSuunta());
    }

    @Test
    public void kummitusVaihtaaSuuntaaKunTormaaSeinaanAlas() {
        huhuu.setSuunta(Hahmo.SUUNTA.ALAS);
        huhuu.setY(429);
        huhuu.liiku(new Kentta());
        assertFalse(Hahmo.SUUNTA.ALAS == huhuu.getSuunta());
    }

    @Test
    public void kummitusVaihtaaSuuntaaKunTormaaSeinaanOikea() {
        huhuu.setSuunta(Hahmo.SUUNTA.OIKEA);
        huhuu.setX(589);
        huhuu.liiku(new Kentta());
        assertFalse(Hahmo.SUUNTA.OIKEA == huhuu.getSuunta());
    }

    @Test
    public void kummitusVaihtaaSuuntaaKunLaskuriTaynna() {
        Hahmo.SUUNTA suunta = huhuu.getSuunta();
        huhuu.setLaskuri(150);
        huhuu.liiku(new Kentta());
        assertTrue(suunta != huhuu.getSuunta());
    }

}
