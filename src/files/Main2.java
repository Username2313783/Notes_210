package files;
import java.io.*;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        // File paths
        String filePath = "src/files/example.txt";
    }
    public static void connection(){
        Scanner scan = new Scanner(System.in);
        String mdp = "";
        System.out.println("entrez preomn nom");
        String[] prenomNom= scan.nextLine().split("//");
        System.out.println("entrez mdp");
        mdp = scan.next();


        // Writing to a file
        try {
            FileWriter writer = new FileWriter(filePath, true);
            writer.write("Hello, world!");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Reading from a file
        try {
            FileReader reader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            String[] info;
            boolean connectionEtablie = false;
            while ((line = bufferedReader.readLine()) != null) {
                info = line.split("/");
                if(info[0].equals(prenomNom[0])) && info[1].equals(prenomNom[1]) && info[2].equals(mdp)){
                    System.out.println("connection yes");
                    connectionEtablie = true;
                    break;
                }
            }
            if(!connectionEtablie){
                System.out.println("connection no");
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

    }
    public static void ecrireMdp(String Filepath){

    }
}