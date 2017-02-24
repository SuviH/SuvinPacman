/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suvinpacman.suvinpacman.nakyma;

import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author suvi
 */
/**
 * PeliLooppi pyorittaa pelia.
 */
public class PeliLooppi extends Timer {

    public PeliLooppi(int i, ActionListener al) {
        super(i, al);
    }

}
