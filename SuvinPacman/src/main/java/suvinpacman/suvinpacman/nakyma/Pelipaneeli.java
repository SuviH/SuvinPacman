/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suvinpacman.suvinpacman.nakyma;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import suvinpacman.suvinpacman.malli.Malli;

/**
 *
 * @author suvi
 */
/**
 * Pelipaneelissa ollaan kun peli on pelitilassa.
 */
public class Pelipaneeli extends JPanel {

    private Malli malli;
    private Nakyma nakyma;

    public Pelipaneeli(Malli malli, Nakyma nakyma) {
        this.malli = malli;
        this.nakyma = nakyma;
        this.setBackground(Color.BLACK);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

}
