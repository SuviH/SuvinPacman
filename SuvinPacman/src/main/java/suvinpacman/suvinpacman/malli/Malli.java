/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suvinpacman.suvinpacman.malli;

/**
 *
 * @author suvi
 */
/**
 * Luokka sisaltaa pelin logiikan, esimerkiksi tiedot mika tila pelissa
 * kulloinkin on.
 */
public class Malli {

    private Kentta kentta;
    private PelinTila tila;

    public Malli(Kentta kentta) {
        this.kentta = kentta;
        this.tila = PelinTila.ALOITUS;
    }

    public enum PelinTila {
        ALOITUS, PELI;
    }

    public void vaihdaPelinTila(PelinTila tila) {
        this.tila = tila;
    }

    public Kentta getKentta() {
        return kentta;
    }

    public PelinTila getTila() {
        return tila;
    }

}
