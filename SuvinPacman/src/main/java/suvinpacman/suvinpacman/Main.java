/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suvinpacman.suvinpacman;

import javax.swing.SwingUtilities;
import suvinpacman.suvinpacman.malli.Kentta;
import suvinpacman.suvinpacman.malli.Malli;
import suvinpacman.suvinpacman.nakyma.Nakyma;

/**
 *
 * @author suvi
 */
/**
 * Peli kaynnistyy Main-luokasta.
 */
public class Main {
/**
 * Main-metodi.
 * @param args main-metodin parametri
 */
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {

                Malli malli = new Malli();
                Nakyma nakyma = new Nakyma(malli);
            }

        });

    }
}
