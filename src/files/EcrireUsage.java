package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EcrireUsage {
    String filepath = ("src/files/user.txt");
    File file = new File(filepath);
    if (!file.exists()) {
        System.err.println("File does not exist.");
        return;
    }


    try {
        FileWriter writer = new FileWriter(filePath, true);
        System.out.println("enter prenombre name mdp");
        Scanner sc = new Scanner(system.in);
        writer.write(scan.next());
        writer.close();
        System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
        System.out.println("An error occurred while writing to the file.");
        e.printStackTrace();
    }
}
}