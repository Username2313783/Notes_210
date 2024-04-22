package CorrectionExam;

import java.util.Scanner;

public class exo1 {
    public static void main(String[] args) {
        //el scaner
        Scanner sc = new Scanner(System.in);
        //el entre
        System.out.println("enter vos mots(fdiez to finish)");
        String mots = "";
        String choix = "";
        while(true){
            choix = sc.next();
            if(choix.equals("fdiez")){
                break;
            }
            mots += choix;
        }
        String[] lettres = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        mots = mots.toLowerCase();
        System.out.println("Les lettres de alphabeto qui ne pas prez: ");
        for(String lettre : lettres){
            if(!mots.contains(lettre)){
                System.out.print(lettre + ",");
            }
        }
    }
}
