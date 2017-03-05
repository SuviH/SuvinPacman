/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suvinpacman.suvinpacman.nakyma;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import suvinpacman.suvinpacman.malli.Malli;

/**
 *
 * @author suvi
 */
/**
 * ActionListener joka hallitsee aloita-nappulan toimintoja.
 */
public class ButtonListener implements ActionListener {

    private Malli malli;
    private Nakyma nakyma;

    /**
     * ButtonListener-luokan konstruktori.
     *
     * @param malli valitettava malli
     * @param nakyma valitettava nakyma
     */

    public ButtonListener(Malli malli, Nakyma nakyma) {
        this.malli = malli;
        this.nakyma = nakyma;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        malli.vaihdaPelinTila(Malli.PelinTila.PELI);
        malli.alustaUusiPeli();
        this.nakyma.getPelipaneeli().getNk().setPacman(malli.getKentta().getPacman());
        nakyma.pelinTilaMuuttunut(Malli.PelinTila.PELI);
    }

}
