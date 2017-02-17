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

    public Hahmo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public enum SUUNTA {
        YLOS, ALAS, VASEN, OIKEA;
    }

    public void liiku(Kentta kentta) {
        if (suunta == SUUNTA.YLOS) {
            if (kentta.onkoKoordinaatissaSeina(this.x, this.y + 1)) {
                suunta = SUUNTA.ALAS;
            } else {
                this.y--;
            }

        } else if (suunta == SUUNTA.ALAS) {
            if (kentta.onkoKoordinaatissaSeina(this.x, this.y - 1)) {
                suunta = SUUNTA.YLOS;
            } else {
                this.y++;
            }

        } else if (suunta == SUUNTA.VASEN) {
            if (kentta.onkoKoordinaatissaSeina(this.x - 1, this.y)) {
                suunta = SUUNTA.OIKEA;
            } else {
                this.x--;
            }

        } else if (suunta == SUUNTA.OIKEA) {
            if (kentta.onkoKoordinaatissaSeina(this.x + 1, this.y)) {
                suunta = SUUNTA.VASEN;
            } else {
                this.x++;
            }

        }
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
