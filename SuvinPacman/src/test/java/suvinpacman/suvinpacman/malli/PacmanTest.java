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
    
    public PacmanTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @Test
    public void testiPacmanSetSuunta(){
        Pacman pacman = new Pacman(1,1);
        pacman.setSuunta(SUUNTA.YLOS);
        assertEquals(SUUNTA.YLOS, pacman.getSuunta());
    }

    
}
