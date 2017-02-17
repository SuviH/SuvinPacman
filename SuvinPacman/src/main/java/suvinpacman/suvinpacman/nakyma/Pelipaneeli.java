/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suvinpacman.suvinpacman.nakyma;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import suvinpacman.suvinpacman.malli.Kentta;
import suvinpacman.suvinpacman.malli.Kummitus;
import suvinpacman.suvinpacman.malli.Malli;
import suvinpacman.suvinpacman.malli.Pacman;

/**
 *
 * @author suvi
 */
/**
 * Pelipaneelissa ollaan kun peli on pelitilassa.
 */
public class Pelipaneeli extends JPanel implements ActionListener {

    private Malli malli;
    private Nakyma nakyma;
    private NappaimistonKuuntelija nk;
    private PeliLooppi loop;

    public Pelipaneeli(Malli malli, Nakyma nakyma) {
        this.malli = malli;
        this.nakyma = nakyma;

        this.setBackground(Color.BLACK);

        this.nk = new NappaimistonKuuntelija(malli.getKentta().getPacman(), this);
        this.addKeyListener(nk);
        this.loop = new PeliLooppi(10, this);
        this.loop.start();

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Pacman pacman = malli.getKentta().getPacman();
        pacman.piirra(g);
        for (Kummitus huhuu : malli.getKentta().getKummitukset()) {
            huhuu.piirra(g);
        }

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        malli.getKentta().getPacman().liiku(malli.getKentta());
        for (Kummitus huhuu : malli.getKentta().getKummitukset()) {
            huhuu.liiku(malli.getKentta());
        }
        this.repaint();

    }

}
