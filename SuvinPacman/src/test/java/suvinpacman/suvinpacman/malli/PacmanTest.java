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
        this.pacman = new Pacman(1, 1);
    }

    @Test
    public void testiPacmanSetSuunta() {
        pacman.setSuunta(SUUNTA.YLOS);
        assertEquals(SUUNTA.YLOS, pacman.getSuunta());
    }

    @Test
    public void testiPacmanXKoordinaatinAsettaminenToimii() {
        assertEquals(1, pacman.getX());
    }

    @Test
    public void testiPacmanYKoordinaatinAsettaminenToimii() {
        assertEquals(1, pacman.getY());
    }

    @Test
    public void testiPacmaninLiikkuminenToimiiYAkseli() {
        pacman.setSuunta(SUUNTA.ALAS);
        pacman.liiku(new Kentta());
        assertEquals(2, pacman.getY());
    }

    @Test
    public void testiPacmaninLiikkuminenToimiiXAkseli() {
        pacman.setSuunta(SUUNTA.OIKEA);
        pacman.liiku(new Kentta());
        assertEquals(2, pacman.getX());
    }

    @Test
    public void testiTormaaKummitukseenKunTrue() {
        Hahmo huhuu = new Kummitus(1, 1);
        Hahmo hohoo = new Kummitus(5, 5);
        ArrayList<Hahmo> kummitukset = new ArrayList<>();
        kummitukset.add(huhuu);
        kummitukset.add(hohoo);

        assertTrue(pacman.tormaaKummitukseen(kummitukset));
    }

    @Test
    public void testiTormaaKummitukseenKunFalse() {
        Hahmo huhuu = new Kummitus(10, 10);
        Hahmo hohoo = new Kummitus(5, 5);
        ArrayList<Hahmo> kummitukset = new ArrayList<>();
        kummitukset.add(huhuu);
        kummitukset.add(hohoo);

        assertFalse(pacman.tormaaKummitukseen(kummitukset));
    }

    @Test
    public void testiTormaaHerkkuunKunTrue() {
        Herkku herkku1 = new Herkku(1, 1);
        Herkku herkku2 = new Herkku(5, 5);
        ArrayList<Herkku> herkut = new ArrayList<>();
        herkut.add(herkku1);
        herkut.add(herkku2);

        assertTrue(pacman.tormaaHerkkuun(herkut));
    }

    @Test
    public void testiTormaaHerkkuunKunFalse() {
        Herkku herkku1 = new Herkku(10, 10);
        Herkku herkku2 = new Herkku(5, 5);
        ArrayList<Herkku> herkut = new ArrayList<>();
        herkut.add(herkku1);
        herkut.add(herkku2);

        assertFalse(pacman.tormaaHerkkuun(herkut));
    }

}
