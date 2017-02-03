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
    public void pacmaninLiikkuminenToimiiYAkseli() {
        pacman.setSuunta(SUUNTA.ALAS);
        pacman.liiku();
        assertEquals(2, pacman.getY());
    }

    @Test
    public void pacmaninLiikkuminenToimiiXAkseli() {
        pacman.setSuunta(SUUNTA.OIKEA);
        pacman.liiku();
        assertEquals(2, pacman.getX());
    }

}
