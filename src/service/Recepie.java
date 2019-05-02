package service;

import entities.Vegetable;
import java.io.*;
import java.util.List;
import java.util.Scanner;

public class Recepie {

    private static File atMentoringFile = new File("atMentoring.txt");

    public static void writeRecepie(List<Vegetable> vegs) throws TextNotWrittenException {

        try (BufferedWriter bufferedOutputStream = new BufferedWriter(new FileWriter(atMentoringFile))) {
            bufferedOutputStream.write(String.valueOf(vegs));
            System.out.println("File has been created. Text is written.");

        } catch (IOException ioe) {
            throw new TextNotWrittenException("Some exception on writing into a file has been cast.");
        }
    }

    public static void readRecepie(List<Vegetable> vegs) throws MyFileNotFoundException {

        try {
            Scanner scan = new Scanner(new BufferedInputStream(new FileInputStream(atMentoringFile)));

            while (scan.hasNextLine()) {
                String readFromFile = scan.nextLine();
                System.out.println("Text " + readFromFile+ " is read out from the file.");
            }

        } catch (FileNotFoundException e) {
            throw new MyFileNotFoundException("Exception on reading from file is met.");
        }
    }
}


