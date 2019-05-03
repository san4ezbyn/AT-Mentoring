package service;

import entities.Vegetable;

import java.io.*;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Recepie {


    private static File atMentoringFile = new File("atMentoring.txt");

    private static String name = "'Vesenniji'";
    private static int tomatoWGHT = 200;
    private static int cucumberWGHT = 200;
    private static int onionWGHT = 50;
    private static String saltOilText = " Chop it, mix, add salt and oil.";
    private static String text = String.format("Salad %s: take %d gr of tomato, %d gr of cucumber, %d gr of green onion. %s", name, tomatoWGHT, cucumberWGHT, onionWGHT, saltOilText);

    public static void writeRecepie(List<Vegetable> vegs) throws TextNotWrittenException {

        try (BufferedWriter bufferedOutputStream = new BufferedWriter(new FileWriter(atMentoringFile))) {
            bufferedOutputStream.write("Ingredients:\n" + String.valueOf(vegs));
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
            System.out.println(text);

        } catch (FileNotFoundException e) {

            throw new MyFileNotFoundException("Exception on reading from file is met.");
        }
    }
}


