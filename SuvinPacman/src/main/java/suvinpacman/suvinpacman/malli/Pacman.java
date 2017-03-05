/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suvinpacman.suvinpacman.malli;

import java.awt.Color;
import java.awt.Graphics;
import suvinpacman.suvinpacman.malli.Herkku;
import suvinpacman.suvinpacman.malli.Hahmo;
import java.util.ArrayList;

/**
 *
 * @author suvi
 */
/**
 * Hahmo-luokan periva luokka, pelin pacman-hahmo.
 */
public class Pacman extends Hahmo {

    /**
     * Luo Pacman-olion, aloitussuuntana oikea.
     */
    public Pacman(int x, int y) {
        super(x, y);
        this.suunta = SUUNTA.OIKEA;
    }

    /**
     * Jos pacman tormaa kummitukseen, palauttaa true, muutoin false.
     */
    public boolean tormaaKummitukseen(ArrayList<Kummitus> kummitukset) {
        for (Kummitus huhuu : kummitukset) {
            int huhuux = huhuu.getX()+15;
            int huhuuy = huhuu.getY()+15;
            double etaisyys = Math.sqrt(Math.pow(x+20 - huhuux, 2) + Math.pow(y+20 - huhuuy, 2));
            if (etaisyys - 20 - 12 <= 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * Jos pacman tormaa herkkuun, palauttaa true, muutoin false.
     */
    public boolean tormaaHerkkuun(Herkku herkku) {

        int herkkux = herkku.getX()+5;
        int herkkuy = herkku.getY()+5;
        double etaisyys = Math.sqrt(Math.pow(x+20 - herkkux, 2) + Math.pow(y+20 - herkkuy, 2));
        if (etaisyys - 20 <= 0) {
            return true;
        }

        return false;
    }

    /**
     * Piirtaa pacmanin.
     */
    public void piirra(Graphics graphics) {
        graphics.setColor(Color.yellow);
        if (this.suunta == SUUNTA.OIKEA) {
            graphics.fillArc(x, y, 40, 40, 40, 280);
        } else if (this.suunta == SUUNTA.VASEN) {
            graphics.fillArc(x, y, 40, 40, 220, 280);
        } else if (this.suunta == SUUNTA.YLOS) {
            graphics.fillArc(x, y, 40, 40, 130, 280);
        } else if (this.suunta == SUUNTA.ALAS) {
            graphics.fillArc(x, y, 40, 40, 310, 280);
        }

    }

    /**
     * Pacmanin liikkumismetodi, jos pacman on tormaamassa seinaan vaihtaa
     * suuntaa vastakkaiseen suuntaan, muutoin muokkaa koordinaatteja niin etta
     * pacman liikkuu suuntaansa.
     */
    public void liiku(Kentta kentta) {
        if (suunta == SUUNTA.YLOS) {
            if (kentta.onkoKoordinaatissaSeina(this.x + 20, this.y - 1) || kentta.onkoKoordinaatissaSeina(this.x, y - 1) || kentta.onkoKoordinaatissaSeina(x + 40, y - 1)) {
                suunta = SUUNTA.ALAS;
            } else {
                this.y--;
            }

        } else if (suunta == SUUNTA.ALAS) {
            if (kentta.onkoKoordinaatissaSeina(this.x + 20, this.y + 41) || kentta.onkoKoordinaatissaSeina(this.x, y + 41) || kentta.onkoKoordinaatissaSeina(x + 40, y + 41)) {
                suunta = SUUNTA.YLOS;
            } else {
                this.y++;
            }

        } else if (suunta == SUUNTA.VASEN) {
            if (kentta.onkoKoordinaatissaSeina(this.x - 1, this.y + 20) || kentta.onkoKoordinaatissaSeina(this.x - 1, y) || kentta.onkoKoordinaatissaSeina(x - 1, y + 40)) {
                suunta = SUUNTA.OIKEA;
            } else {
                this.x--;
            }

        } else if (suunta == SUUNTA.OIKEA) {
            if (kentta.onkoKoordinaatissaSeina(this.x + 41, this.y + 20) || kentta.onkoKoordinaatissaSeina(this.x + 41, y) || kentta.onkoKoordinaatissaSeina(x + 41, y + 40)) {
                suunta = SUUNTA.VASEN;
            } else {
                this.x++;
            }

        }
    }
}
