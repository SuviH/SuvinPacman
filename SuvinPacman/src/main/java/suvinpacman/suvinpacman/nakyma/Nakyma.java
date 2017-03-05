/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suvinpacman.suvinpacman.nakyma;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import suvinpacman.suvinpacman.malli.Malli;
import suvinpacman.suvinpacman.malli.Malli.PelinTila;

/**
 *
 * @author suvi
 */
/**
 * Luokka hoitaa nakymien hallinnan.
 */
public class Nakyma extends JFrame implements ActionListener {

    private JPanel paapaneeli;
    private Aloituspaneeli aloituspaneeli;
    private Pelipaneeli pelipaneeli;
    private Malli malli;
    private Timer ajastin;
    

    public Nakyma(Malli malli) {
        this.malli = malli;
        this.setSize(640, 480);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Suvin Pacman-peli");
        this.ajastin = new Timer(4000,this);
        this.ajastin.setRepeats(false);
        this.paapaneeli = new JPanel(new CardLayout());
        this.aloituspaneeli = new Aloituspaneeli(malli, this);
        this.pelipaneeli = new Pelipaneeli(malli, this);
        this.paapaneeli.add(aloituspaneeli, "aloitus");
        this.paapaneeli.add(pelipaneeli, "peli");

        this.add(paapaneeli);

    }
/**
 * Tarkastaa, onko pelin tila muuttunut, ja jos on, asettaa cardlayoutissa nakyviin tilaa vastaavan paneelin.
 */
    public void pelinTilaMuuttunut(PelinTila tila){
        CardLayout cl = (CardLayout) (this.paapaneeli.getLayout());
        if (tila == PelinTila.ALOITUS) {
            cl.show(paapaneeli, "aloitus");
        } else if (tila == PelinTila.PELI) {
            cl.show(paapaneeli, "peli");
            this.pelipaneeli.setFocusable(true);
            this.pelipaneeli.requestFocusInWindow();
            this.pelipaneeli.getLoop().restart();
        } else if (tila == PelinTila.VOITTO){
            this.pelipaneeli.getLoop().stop();
            this.ajastin.restart();
        } else if (tila== PelinTila.HAVIO){
            this.pelipaneeli.getLoop().stop();
            this.ajastin.restart();
            
        }
    }

    public Pelipaneeli getPelipaneeli() {
        return pelipaneeli;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        malli.vaihdaPelinTila(Malli.PelinTila.ALOITUS);
        this.pelinTilaMuuttunut(Malli.PelinTila.ALOITUS);
    }

    

}
