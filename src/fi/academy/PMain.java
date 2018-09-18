package fi.academy;

import java.util.List;
import java.util.Scanner;

public class PMain {
    public static void Pkaynnista() {

        PKysymysLista koe = new PKysymysLista();
        List<PKysymys> tehtavat = koe.getLomake();
        PPistelaskuri pisteet = new PPistelaskuri();

        System.out.println("Tervetuloa planeettavisaan!");
        System.out.println("Nyt se alkaa:");


        for (int i = 0; i < 3; i++) {
            System.out.println(tehtavat.get(i));
            Scanner lukija = new Scanner(System.in);
            String arvaus = lukija.nextLine();
            if (arvaus.equals(tehtavat.get(i).oikeaVastaus)) {
                System.out.println("Oikein!");
                System.out.println();
                pisteet.lisaaPiste();
            }
            else {
            }
        }
        System.out.println("Pistemääräsi on: " + pisteet.getPistemaara());
    }
}
