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
public class Kentta {

    private Pacman pacman;
    private ArrayList<Kummitus> kummitukset;
    private ArrayList<Herkku> herkut;
    private ArrayList<Seinapala> seinat;

    public Kentta() {
        this.kummitukset = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            this.kummitukset.add(new Kummitus(300, 250));
        }
        this.herkut = new ArrayList<>();
        this.seinat = new ArrayList<>();
        this.pacman = new Pacman(0, 0);

    }

    public void lisaaHerkut() {
        int x = 0;
        int y = 0;
        for (int i = 0; i < 10; i++) {
            this.herkut.add(new Herkku(x, y));
            x = x + 10;
            y = y + 10;
        }
    }

    public boolean onkoKaikkiHerkutSyoty() {
        if (this.herkut.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public void setSeinat(ArrayList<Seinapala> seinat) {
        this.seinat = seinat;
    }

    public ArrayList<Herkku> getHerkut() {
        return herkut;
    }

    public ArrayList<Kummitus> getKummitukset() {
        return kummitukset;
    }

    public Pacman getPacman() {
        return pacman;
    }

    public ArrayList<Seinapala> getSeinat() {
        return seinat;
    }

}
