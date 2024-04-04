package exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scan = new Scanner (System.in);
//
//        System.out.println("Entre un int entre 0 et 98");
//        byte choix;
//        try{
//            choix = scan.nextByte();
//            if(choix < 0 || choix > 98){
//                throw new Exception("Mauvais nombre");
//            }
//        }
//        catch(Exception e){
//            System.out.println("Choix invalide");
//        }
        Scanner scan = new Scanner(System.in);

            System.out.println("Enter your age");
            byte Age;
            float height;
            boolean IsStudentMV;

            boolean formulaireIncomplet = true;
            while (formulaireIncomplet){
                try {
                    System.out.println("Enter your age : ");
                    Age = scan.nextByte();
                    if(Age < 0 ) {
                        throw new Exception();
                    }

                    System.out.println("Enter your height : ");
                    height = scan.nextFloat();
                    if (height < 0 || height > 4) {
                        throw new Exception();
                    }
                    System.out.println("U a studentz? : ");
                    IsStudentMV = scan.nextBoolean();

                } catch (Exception e) {
                    System.out.println("Invalid entry");
                    scan.nextLine();
                    continue;
                }
                System.out.println("Information we gathered: ");
                System.out.println("Age : " + Age);
                System.out.println("Height : " + height);
                System.out.println("Iz studentz? : " + IsStudentMV);
                System.out.println("Are these informations correct? y/n");
                String choix = scan.next();
                if(choix.compareTo("o") != 0){
                    continue;
                }
                formulaireIncomplet = false;
            }
                System.out.println("End");

        }

    }










