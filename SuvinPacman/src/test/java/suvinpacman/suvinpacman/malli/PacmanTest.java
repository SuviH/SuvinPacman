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
import suvinpacman.suvinpacman.malli.Hahmo.SUUNTA;

/**
 *
 * @author suvi
 */
public class PacmanTest {

    private Pacman pacman;

    public PacmanTest() {
    }

    @Before
    public void setUp() {
        this.pacman = new Pacman(21, 21);
    }

    @Test
    public void testiPacmanSetSuunta() {
        pacman.setSuunta(SUUNTA.YLOS);
        assertEquals(SUUNTA.YLOS, pacman.getSuunta());
    }

    @Test
    public void pacmanSuuntaAlussaOikea() {
        assertEquals(SUUNTA.OIKEA, pacman.getSuunta());
    }

    @Test
    public void testiPacmanXKoordinaatinAsettaminenToimii() {
        assertEquals(21, pacman.getX());
    }

    @Test
    public void testiPacmanYKoordinaatinAsettaminenToimii() {
        assertEquals(21, pacman.getY());
    }

    @Test
    public void testiPacmaninLiikkuminenToimiiYAkseli() {
        pacman.setSuunta(SUUNTA.ALAS);
        pacman.liiku(new Kentta());
        assertEquals(22, pacman.getY());
    }

    @Test
    public void testiPacmaninLiikkuminenToimiiXAkseli() {
        pacman.setSuunta(SUUNTA.OIKEA);
        pacman.liiku(new Kentta());
        assertEquals(22, pacman.getX());
    }

    @Test
    public void testiTormaaKummitukseenKunTrue() {
        Kummitus huhuu = new Kummitus(21, 21);
        Kummitus hohoo = new Kummitus(100, 100);
        ArrayList<Kummitus> kummitukset = new ArrayList<>();
        kummitukset.add(huhuu);
        kummitukset.add(hohoo);

        assertTrue(pacman.tormaaKummitukseen(kummitukset));
    }

    @Test
    public void testiTormaaKummitukseenKunFalse() {
        Kummitus huhuu = new Kummitus(100, 100);
        Kummitus hohoo = new Kummitus(200, 200);
        ArrayList<Kummitus> kummitukset = new ArrayList<>();
        kummitukset.add(huhuu);
        kummitukset.add(hohoo);

        assertFalse(pacman.tormaaKummitukseen(kummitukset));
    }

    @Test
    public void testiTormaaHerkkuunKunTrue() {
        Herkku herkku = new Herkku(41, 41);
        assertTrue(pacman.tormaaHerkkuun(herkku));
    }

    @Test
    public void testiTormaaHerkkuunKunFalse() {
        Herkku herkku = new Herkku(60, 60);
        assertFalse(pacman.tormaaHerkkuun(herkku));
    }

    @Test
    public void pacmanVaihtaaSuuntaaKunTormaaSeinaanYlos() {
        pacman.setSuunta(SUUNTA.YLOS);
        pacman.liiku(new Kentta());
        assertEquals(SUUNTA.ALAS, pacman.getSuunta());
    }

    @Test
    public void pacmanVaihtaaSuuntaaKunTormaaSeinaanVasen() {
        pacman.setSuunta(SUUNTA.VASEN);
        pacman.liiku(new Kentta());
        assertEquals(SUUNTA.OIKEA, pacman.getSuunta());
    }

    @Test
    public void pacmanVaihtaaSuuntaaKunTormaaSeinaanAlas() {
        pacman.setSuunta(SUUNTA.ALAS);
        pacman.setY(419);
        pacman.liiku(new Kentta());
        assertEquals(SUUNTA.YLOS, pacman.getSuunta());
    }

    @Test
    public void pacmanVaihtaaSuuntaaKunTormaaSeinaanOikea() {
        pacman.setSuunta(SUUNTA.OIKEA);
        pacman.setX(579);
        pacman.liiku(new Kentta());
        assertEquals(SUUNTA.VASEN, pacman.getSuunta());
    }

}
