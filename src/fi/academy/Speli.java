package fi.academy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Speli {

    public static void Skaynnista() {

        Scanner lukija = new Scanner(System.in);

        SKysymykset k1 = new SKysymykset("Onko nyt perjantai? (on / ei)", "on");
        SKysymykset k2 = new SKysymykset("Montako bittiä sisältyy short-primitiivityyppiin? (8 / 16 / 32)", "16");
        SKysymykset k3 = new SKysymykset("Periikö aliluokka yliluokan? (kyllä / ei)", "kyllä");
        SKysymykset k4 = new SKysymykset("Mikä näistä viittaa primitiivityyppiin? (String / float / toString)", "float");
        SKysymykset k5 = new SKysymykset("Mikä näistä ei ole looginen operaattori? (^ / | / ==)", "==");
        SKysymykset k6 = new SKysymykset("Mikä näistä ei ole Set-rajapinnan toteutus? (TreeSet / LinkedHashSet / WeakSet)", "WeakSet");
        SKysymykset k7 = new SKysymykset("Mikä näistä on tyyppimuunnos? ({String} / (String) / [String])", "(String)");
        SKysymykset k8 = new SKysymykset("Millä hyppylauseella palautetaan kontrolli toistolauseen alkuun? (return / break / continue)", "continue");
        SKysymykset k9 = new SKysymykset("VOiko taulukko olla metodin parametri? (kyllä / ei)", "kyllä");
        SKysymykset k10 = new SKysymykset("Näkyykö protected-attribuutti saman pakkauksen luokissa? (kyllä / ei)", "kyllä");

        List<SKysymykset> lista = new ArrayList<>();
        lista.add(k1);
        lista.add(k2);
        lista.add(k3);
        lista.add(k4);
        lista.add(k5);
        lista.add(k6);
        lista.add(k7);
        lista.add(k8);
        lista.add(k9);
        lista.add(k10);
        Collections.shuffle(lista);

        int oikeatVastaukset = 0;

        for(SKysymykset kysymys: lista){
            System.out.println(kysymys);
            String syote = lukija.nextLine();
            kysymys.tarkistus(syote);
            if(syote.equals(kysymys.getVastaus())) {
                oikeatVastaukset += 1;
            }
        }

        if(oikeatVastaukset == 10) {
            System.out.println("Loisto homma! Sait kaikki oikein.");
        } else if(oikeatVastaukset < 10 && oikeatVastaukset > 4) {
            System.out.println("Hyvä! Sait " + oikeatVastaukset + "/10 oikein.");
        } else {
            System.out.println("Opiskele lisää! Sait vain " + oikeatVastaukset + "/10 oikein.");
        }


    }

}
