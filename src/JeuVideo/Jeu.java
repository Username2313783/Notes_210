package JeuVideo;

import java.util.Scanner;

public class Jeu {

    public static void main(String[] args) {
        PNJ[] Boss = {new PNJ("Bowser", (short) 10, new Dague((short) 40), (short) 400),
                new PNJ("Ganondorf", (short) 500, new Epee((short) 400), (short) 5000),
                new PNJ("Malenia", (short) 4000, new Arc((short) 6000), (short) 10000)
        };
        Arme[] armes = {
                new Arc((short) 60),
                new Epee((short) 80),
                new Masse((short) 200),
                new Dague((short) 20),
                new Arbalete((short) 80)
        };
        System.out.println(" Sélectionner votre arme");
        System.out.println(" 1 - Arc");
        System.out.println(" 2 - Épée");
        System.out.println(" 3 - Masse");
        System.out.println(" 4 - Dague");
        System.out.println(" 5 - Arbalète");
        System.out.print("Votre choix : ");
        Scanner scan = new Scanner(System.in);
        String choix = scan.next();
        Arme arme = new Arme((short) 0);
        if (choix.equals("1")) {
            arme = new Arc((short) 60);
        } else if (choix.equals("2")) {
            arme = new Epee((short) 80);
        } else if (choix.equals("3")) {
            arme = new Masse((short) 200);
        } else if (choix.equals("4")) {
            arme = new Dague((short) 20);
        } else if (choix.equals("5")) {
            arme = new Arbalete((short) 80);
        } else {
            System.out.println("Error stupido");
        }
        System.out.println("Vous avez choisi l'arme :" + arme);

        // niv 1 // pdv 200
        Hero dude = new Hero("Geralt", (short) 1, arme, (short) 200, 0);
        while(dude.getPdv() != 0 && Boss[0].getPdv() != 0){
            dude.attaquer(Boss[0]);
            if (Boss[0].getPdv() != 0){
                Boss[0].attaquer(dude);
        }
    }
    System.out.println("dude");
    System.out.println(Boss[0]);
    Boss[0].setPdv((short)(10* Boss[0].getNiveau()));
    dude.setXp(dude.getXp() + 50);


}

}