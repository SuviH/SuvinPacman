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
/**
 * Kentta sisaltaa kaikki pelikentalla olevat palaset, hahmot, herkut, seinat.
 */
public class Kentta {

    private Pacman pacman;
    private ArrayList<Kummitus> kummitukset;
    private ArrayList<Herkku> herkut;
    private ArrayList<Seinapala> seinat;

    public Kentta() {
        this.kummitukset = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            this.kummitukset.add(new Kummitus(300, 250));
        }
        this.herkut = new ArrayList<>();
        this.seinat = new ArrayList<>();
        seinat.add(new Seinapala(0,0,20, 480));
        seinat.add(new Seinapala(0,0,640,20));
        seinat.add(new Seinapala(620, 0, 20, 480));
        seinat.add(new Seinapala(0, 460, 640, 20));
        this.pacman = new Pacman(21, 21);

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

    public boolean onkoKoordinaatissaSeina(int x, int y) {
        for (Seinapala seina : this.seinat) {
            if (seina.getX() <= x && seina.getX()+seina.getX2() >= x && seina.getY() <= y && seina.getY()+seina.getY2() >= y) {
                return true;
            }
        }
        return false;
    }

}
