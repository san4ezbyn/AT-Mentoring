package service;

import entities.Vegetable;
import exceptions.MyFileNotFoundException;
import exceptions.TextNotWrittenException;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class RecepieWriteIO {


    private static File atMentoringFile = new File("atMentoring.txt");

    public static void writeRecepie(List<Vegetable> vegs) throws TextNotWrittenException {

        try (BufferedWriter bufferedOutputStream = new BufferedWriter(new FileWriter(atMentoringFile))) {
            bufferedOutputStream.write("Ingredients:\n"+ Recepie.recepieIngreds(vegs));
            System.out.println("Text is written in the file.\n");

        } catch (IOException ioe) {
            throw new TextNotWrittenException("Some exception on writing into a file has been cast.");
        }
    }

    public static void readRecepie(List<Vegetable> vegs) throws MyFileNotFoundException {

        try {
            Scanner scan = new Scanner(new BufferedInputStream(new FileInputStream(atMentoringFile)));

            System.out.println("Text from file:\nRECEPIE:");

            while (scan.hasNextLine()) {
                String readFromFile = scan.nextLine();
                System.out.println(readFromFile);
            }
            Recepie.recepieIngreds(vegs);
        } catch (FileNotFoundException e) {

            throw new MyFileNotFoundException("Exception on reading from file is met.");
        }
    }
}


