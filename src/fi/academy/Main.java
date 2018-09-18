package fi.academy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        Speli speli = new Speli();
        PMain ppeli = new PMain();
        Arvauspeli npeli = new Arvauspeli();
        System.out.println("Tervetuloa visailemaan!");
        while (true) {
        System.out.println("Paina 1, jos haluat pelata Samin pelia");
        System.out.println("Paina 2, jos haluat pelata Nooan peliä");
        System.out.println("Paina 3, jos haluat pelata Paulan peliä");
        System.out.println("Paina 0, jos haluat lopettaa visailun");
            String syote = lukija.nextLine();

            if (syote.equals("0")) {
                break;
            }

            switch (syote) {
                case "1":
                    Speli.Skaynnista();
                    break;
                case "2":
                    Arvauspeli.Nkaynnista();
                    break;
                case "3":
                    PMain.Pkaynnista();
                    break;
                default:
                    System.out.println("Väärä syöte! Näppäile 1,2 tai 3");
                    break;

            }
        }



    }

}
