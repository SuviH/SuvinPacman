/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suvinpacman.suvinpacman.nakyma;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import suvinpacman.suvinpacman.malli.Hahmo;
import suvinpacman.suvinpacman.malli.Pacman;

/**
 *
 * @author suvi
 */
/**
 * Tapahtumakuuntelija, joka kuuntelee nuolinappaimia, ja vaihtaa pacmanin suuntaa.
 */
public class NappaimistonKuuntelija implements KeyListener {

    private Pacman pacman;
    private Component component;

    public NappaimistonKuuntelija(Pacman pacman, Component component) {
        this.pacman = pacman;
        this.component = component;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            pacman.setSuunta(Hahmo.SUUNTA.VASEN);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            pacman.setSuunta(Hahmo.SUUNTA.OIKEA);
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            pacman.setSuunta(Hahmo.SUUNTA.YLOS);
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            pacman.setSuunta(Hahmo.SUUNTA.ALAS);
        }

        component.repaint();
    }

    @Override
    public void keyReleased(KeyEvent ke) {

    }

}
