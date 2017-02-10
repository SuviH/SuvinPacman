/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suvinpacman.suvinpacman.nakyma;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    
    public ButtonListener(Malli malli, Nakyma nakyma) {
        this.malli = malli;
        this.nakyma = nakyma;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        malli.vaihdaPelinTila(Malli.PelinTila.PELI);
        nakyma.pelinTilaMuuttunut(Malli.PelinTila.PELI);
    }
    
}
