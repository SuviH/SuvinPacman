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
 * Pelikentan seinat koostuvat useista seinapaloista.
 */
public class Seinapala {

    private int x;
    private int y;
    private int x2;
    private int y2;

    /**
     * Luo seinapalan koordinaattiin x,y, seinapalan leveys on x2 ja korkeus y2.
     *
     * @param x x-koordinaatti
     * @param y y-koordinaatti
     * @param x2 leveys
     * @param y2 korkeus
     */
    public Seinapala(int x, int y, int x2, int y2) {
        this.x = x;
        this.y = y;
        this.x2 = x2;
        this.y2 = y2;
    }

    /**
     * Piirtaa seinapalan.
     *
     * @param graphics Graphics-luokan ilmentyma, jonka avulla piirtaminen
     * tehdaan
     */
    public void piirra(Graphics graphics) {
        graphics.setColor(Color.RED);
        graphics.fillRect(x, y, x2, y2);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

}
