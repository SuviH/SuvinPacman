/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suvinpacman.suvinpacman.nakyma;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author suvi
 */
public class Aloituspaneeli extends JPanel {

    private JButton aloitaNappi;

    public Aloituspaneeli() {
        this.aloitaNappi = new JButton("Aloita");
        this.add(aloitaNappi);
    }
}
