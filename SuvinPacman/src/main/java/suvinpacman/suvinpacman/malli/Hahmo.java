/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suvinpacman.suvinpacman.malli;

import java.util.ArrayList;

/**
 *
 * @author suvi
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

    public void liiku() {
        if (suunta == SUUNTA.YLOS) {
            this.y--;
        } else if (suunta == SUUNTA.ALAS) {
            this.y++;
        } else if (suunta == SUUNTA.VASEN) {
            this.x--;
        } else if (suunta == SUUNTA.OIKEA) {
            this.x++;
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

    public boolean tormaaSeinaan(ArrayList<Seinapala> seinat) {

        return false;
    }

}
