/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suvinpacman.suvinpacman.nakyma;

import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import suvinpacman.suvinpacman.malli.Malli;
import suvinpacman.suvinpacman.malli.Malli.PelinTila;

/**
 *
 * @author suvi
 */
/**
 * Luokka hoitaa nakymien hallinnan.
 */
public class Nakyma extends JFrame {

    private JPanel paapaneeli;
    private Aloituspaneeli aloituspaneeli;
    private Pelipaneeli pelipaneeli;
    private Malli malli;
    //private CardLayout cl;

    public Nakyma(Malli malli) {
        this.malli = malli;
        this.setSize(640, 480);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Suvin Pacman-peli");

        this.paapaneeli = new JPanel(new CardLayout());
        this.aloituspaneeli = new Aloituspaneeli(malli, this);
        this.pelipaneeli = new Pelipaneeli(malli, this);
        this.paapaneeli.add(aloituspaneeli, "aloitus");
        this.paapaneeli.add(pelipaneeli, "peli");

        this.add(paapaneeli);

    }

    public void pelinTilaMuuttunut(PelinTila tila) {
        CardLayout cl = (CardLayout) (this.paapaneeli.getLayout());
        if (tila == PelinTila.ALOITUS) {
            cl.show(paapaneeli, "aloitus");
        } else if (tila == PelinTila.PELI) {
            cl.show(paapaneeli, "peli");
        }
    }
}
