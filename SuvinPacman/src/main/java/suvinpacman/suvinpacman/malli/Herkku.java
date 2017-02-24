/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suvinpacman.suvinpacman.malli;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author suvi
 */
/**
 * Luokasta muodostuvat pelin herkut joita pacman syo.
 */
public class Herkku {

    private int x;
    private int y;

    public Herkku(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void piirra(Graphics graphics) {
        graphics.setColor(Color.ORANGE);
        graphics.fillOval(x, y, 10, 10);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

}
