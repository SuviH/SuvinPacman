/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suvinpacman.suvinpacman.nakyma;

import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author suvi
 */
public class Nakyma extends JFrame {

    private JPanel paaPaneeli;
    private Aloituspaneeli aloituspaneeli;
    private Pelipaneeli pelipaneeli;

    public Nakyma() {
        this.setSize(640, 480);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Suvin Pacman-peli");
        this.paaPaneeli = new JPanel(new CardLayout());
        this.aloituspaneeli = new Aloituspaneeli();
        this.pelipaneeli = new Pelipaneeli();
        this.paaPaneeli.add(aloituspaneeli);
        this.add(paaPaneeli);

    }
}
