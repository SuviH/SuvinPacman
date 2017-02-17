/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suvinpacman.suvinpacman.malli;

import java.awt.Color;
import java.awt.Graphics;
import suvinpacman.suvinpacman.malli.Hahmo;

/**
 *
 * @author suvi
 */
/**
 * Hahmo-luokan periva luokka, pelin kummitus-hahmot.
 */
public class Kummitus extends Hahmo {

    public Kummitus(int x, int y) {
        super(x, y);
    }
    public void piirra(Graphics graphics) {
        graphics.setColor(Color.PINK);
        graphics.fillOval(x, y, 30, 30);
        graphics.setColor(Color.WHITE);
        graphics.fillOval(x+8, y+10, 7, 7);
        graphics.fillOval(x+18, y+10, 7, 7);
        graphics.setColor(Color.BLACK);
        graphics.fillOval(x+9, y+11, 3, 3);
        graphics.fillOval(x+19, y+11, 3, 3);
        
        
    }

}
