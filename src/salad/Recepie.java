package salad;

import java.io.*;
import java.util.Scanner;

public class Recepie {

    public static void writeRecepie() throws IOException {

        File atMentoringFile = new File("atMentoring.txt");


        try (BufferedWriter bufferedOutputStream = new BufferedWriter(new FileWriter(atMentoringFile))) {
            bufferedOutputStream.write("RECEPIE of the salad:\n   OLIV'E  ");

        } catch (IOException i) {
            System.out.println("Some exception on writing into a file has been cast.");
        }


        try {
            Scanner scan =  new Scanner(new BufferedInputStream(new FileInputStream(atMentoringFile)));

            while (scan.hasNextLine()) {
                String readFromFile = scan.nextLine();
                System.out.println(readFromFile);
            }


        } catch (FileNotFoundException e) {
            System.out.println("Exception on reading from file are met.");
        }
        }
    }


