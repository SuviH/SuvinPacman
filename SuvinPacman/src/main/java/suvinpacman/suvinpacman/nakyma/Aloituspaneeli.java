/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suvinpacman.suvinpacman.nakyma;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import suvinpacman.suvinpacman.malli.Malli;

/**
 *
 * @author suvi
 */
/**
 * Aloituspaneeli, jossa peli on aloitustilassa, tasta luokasta peli alkaa ja
 * siirtyy pelitilaan.
 */
public class Aloituspaneeli extends JPanel {

    private JButton aloitaNappi;
    private Malli malli;
    private Nakyma nakyma;

    /**
     * Konstruktorissa asetetaan paneeliin aloitusnappi, tapahtumakuuntelija,
     * seka nakyma ja malli.
     * @param malli konstruktorissa valitettava malli
     * @param nakyma konstruktorissa valitettava nakyma
     */
    public Aloituspaneeli(Malli malli, Nakyma nakyma) {
        this.malli = malli;
        this.nakyma = nakyma;
        this.aloitaNappi = new JButton("Aloita");
        ActionListener bl = new ButtonListener(malli, nakyma);
        this.aloitaNappi.addActionListener(bl);
        this.add(aloitaNappi);

    }
}
