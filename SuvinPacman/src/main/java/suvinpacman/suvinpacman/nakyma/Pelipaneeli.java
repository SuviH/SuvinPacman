/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suvinpacman.suvinpacman.nakyma;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import suvinpacman.suvinpacman.malli.Herkku;
import suvinpacman.suvinpacman.malli.Kentta;
import suvinpacman.suvinpacman.malli.Kummitus;
import suvinpacman.suvinpacman.malli.Malli;
import suvinpacman.suvinpacman.malli.Pacman;
import suvinpacman.suvinpacman.malli.Seinapala;

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

    /**
     * Pelipaneelin luova konstruktori.
     *
     * @param malli parametrina valitettava malli
     * @param nakyma parametrina valitettava nakyma
     */

    public Pelipaneeli(Malli malli, Nakyma nakyma) {
        this.malli = malli;
        this.nakyma = nakyma;

        this.setBackground(Color.BLACK);

        this.nk = new NappaimistonKuuntelija(this);
        this.addKeyListener(nk);
        this.loop = new PeliLooppi(10, this);

    }

    @Override
    protected void paintComponent(Graphics g) {

        if (malli.getTila() == Malli.PelinTila.VOITTO) {
            g.setColor(Color.RED);
            Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 30);
            g.setFont(font);
            g.drawString("VOITIT PELIN", 200, 220);

        } else if (malli.getTila() == Malli.PelinTila.HAVIO) {
            g.setColor(Color.RED);
            Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 30);
            g.setFont(font);
            g.drawString("HÄVISIT PELIN", 200, 220);

        } else {
            super.paintComponent(g);

            Pacman pacman = malli.getKentta().getPacman();
            pacman.piirra(g);
            for (Kummitus huhuu : malli.getKentta().getKummitukset()) {
                huhuu.piirra(g);
            }
            for (Seinapala seina : malli.getKentta().getSeinat()) {
                seina.piirra(g);
            }
            for (Herkku herkku : malli.getKentta().getHerkut()) {
                herkku.piirra(g);
            }
        }

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (malli.getKentta().getHerkut().isEmpty()) {
            malli.vaihdaPelinTila(Malli.PelinTila.VOITTO);
            nakyma.pelinTilaMuuttunut(Malli.PelinTila.VOITTO);

        } else if (malli.getKentta().getPacman().tormaaKummitukseen(malli.getKentta().getKummitukset())) {
            malli.vaihdaPelinTila(Malli.PelinTila.HAVIO);
            nakyma.pelinTilaMuuttunut(Malli.PelinTila.HAVIO);

        } else {
            malli.getKentta().getPacman().liiku(malli.getKentta());
            for (Kummitus huhuu : malli.getKentta().getKummitukset()) {
                huhuu.liiku(malli.getKentta());
            }
            ArrayList<Herkku> syodyt = new ArrayList<>();
            for (Herkku herkku : malli.getKentta().getHerkut()) {
                if (malli.getKentta().getPacman().tormaaHerkkuun(herkku)) {
                    syodyt.add(herkku);
                }
            }
            if (!syodyt.isEmpty()) {
                malli.getKentta().getHerkut().removeAll(syodyt);
            }
        }

        this.repaint();

    }

    public PeliLooppi getLoop() {
        return loop;
    }

    public NappaimistonKuuntelija getNk() {
        return nk;
    }

}
