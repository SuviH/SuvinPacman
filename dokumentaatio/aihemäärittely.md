### Aihe:
Tarkoituksena toteuttaa Pacmanin kaltainen sokkelopeli, jossa Pacman-pallero syö kentällä olevia pisteitä/herkkuja. Pacman-pallerolla on vihollisenaan haamuja, jotka yrittävät saada Pacmanin kiinni. Pelaaja ohjailee Pacmania, välttelee haamuja ja yrittää syödä kaikki herkut. Pelaaja voittaa, jos hän onnistuu syömään kaikki pallerot, ja häviää, jos haamut onnistuvat saamaan pacmanin kiinni. Alussa, ja aina pelin päätyttyä ollaan aloitusruudussa, jossa on nappula "Aloita", jota painamalla siirrytään peliruutuun ja uusi peli alkaa.

### Toiminnot:
-uuden pelin aloittaminen

###Käyttöohje
Kun peli käynnistetään, siirrytään aloitusruutuun, josta löytyy nappula "Aloita". Kun tätä klikataan, alkaa uusi peli. Pacman lähtee heti liikkeelle ja jatkaa liikkumistaan koko pelin ajan. Pacmania ohjaillaan nuolinäppäimillä, joista Pacmanin suunta vaihtuu nuolinäppäimen osoittamaan suuntaan. Ohjaile Pacmania, yritä syödä kaikki herkut ja varo kummituksia, ne saattavat olla liikkeissään äkkinäisiä! Kun peli päättyy, siirrytään hetken kuluttua automaattisesti aloitusruutuun, josta voit taas aloittaa uuden pelin.

### Rakennekuvaus
Ohjelma on jaettu pakkauksiin Malli ja Nakyma. Pakkauksesta Malli löytyvät ohjelman kaikki palaset, kuten Pacman, Kummitus ja Kentta. Luokka Kentta sisältää kentällä näkyvät palaset, eli pacmanin, kummitukset, seinat ja herkut. Luokka Hahmo on abstrakti luokka, jonka luokat Pacman ja Kummitus perivät. Pakkauksesta löytyy myös luokka Malli, joka sisältää ohjelman toimintalogiikan.
Nakyma-pakkauksessa on ohjelman käyttöliittymäpuoli. Nakymaan kuuluvat Aloituspaneeli ja Pelipaneeli, joista näytetään aina jompaakumpaa pelin tilasta riippuen. Näiden luokkien toimintaa ohjaamaan on luotu kuuntelijat ButtonListener ja NappaimistonKuuntelija. Lisäksi pakkauksessa on luokka PeliLooppi, joka huolehtii ohjelman pyörittämisestä Timer-luokan avulla.



![Luokkakaavio](/dokumentaatio/PacmanLuokkakaavio.png)

Seuraavassa sekvenssikaaviossa kuvaa olioiden välistä vuorovaikutusta tilanteessa, jossa "Aloita"-nappia painetaan, eli jossa ButtonListener-luokan actionPerformed-metodin suoritus lähtee liikkeelle. Napin painaminen aiheuttaa uuden pelin alustamisen ja käynnistymisen.

![Sekvenssikaavio](/dokumentaatio/IMG_2191.JPG)


