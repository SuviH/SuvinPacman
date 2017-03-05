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

    /**
     * Malli-luokan konstruktori, jossa uusi peli alustetaan ja pelitilaksi
     * asetetaan aloitus.
     *
     */
    public Malli() {
        this.alustaUusiPeli();
        this.tila = PelinTila.ALOITUS;
    }

    /**
     * Enum pelinTila kuvaa pelin kahta vaihtoehtoista tilaa, joiden perusteella
     * esim nakymassa nakyva paneeli valitaan.
     */
    public enum PelinTila {
        ALOITUS, PELI, VOITTO, HAVIO;
    }

    /**
     * Vaihtaa pelitilaksi parametrina olevan tilan.
     *
     * @param tila asetettava pelitila
     */
    public void vaihdaPelinTila(PelinTila tila) {
        this.tila = tila;
    }

    public Kentta getKentta() {
        return kentta;
    }

    /**
     * Palauttaa tiettyna hetkena voimassa olevan pelitilan.
     *
     * @return pelitila
     */

    public PelinTila getTila() {
        return tila;
    }

    /**
     * Alustaa uuden kentan uutta pelia varten, eli luo uudet pacman-,
     * kummitus-, herkku ja seinapalaoliot.
     */

    public void alustaUusiPeli() {
        this.kentta = new Kentta();

    }

}
