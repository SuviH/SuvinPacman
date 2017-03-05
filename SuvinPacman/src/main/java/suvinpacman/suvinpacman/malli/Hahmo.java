/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suvinpacman.suvinpacman.malli;

import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author suvi
 */
/**
 * Abstrakti luokka Hahmo, jonka Kummitus ja Pacman perivat.
 */
public abstract class Hahmo {

    protected int x;
    protected int y;
    protected SUUNTA suunta;

    /**
     * Luo uuden Hahmo-luokan ilmentyman.
     *
     * @param x x-koordinaatti
     * @param y y-koordinaatti
     */
    public Hahmo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Enum-luokka suunta maarittaa hahmojen suunnan.
     */
    public enum SUUNTA {
        YLOS, ALAS, VASEN, OIKEA;
    }

    public void setSuunta(SUUNTA suunta) {
        this.suunta = suunta;
    }

    public SUUNTA getSuunta() {
        return suunta;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

}
