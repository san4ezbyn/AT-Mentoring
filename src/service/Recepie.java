package service;

import entities.Vegetable;

import java.io.*;
import java.util.List;
import java.util.Scanner;
// в целом конечно запись есть, но если уж говорить про рецеп, то пусть он выглядит соответствующе
// например: Для домашненго овощного салата возьмите 100 грам помидоров, 200 грам огруцов и т.д. всё мелко порезатьб смешать, специи и соус по вкусу
public class Recepie {

    public static void writeRecepie(List<Vegetable> vegs) throws IOException {

        File atMentoringFile = new File("atMentoring.txt");


        try (BufferedWriter bufferedOutputStream = new BufferedWriter(new FileWriter(atMentoringFile))) {
            bufferedOutputStream.write(String.valueOf(vegs));

        } catch (IOException i) {
//            хорошее место чтобы пробросить кастомный эксепшен
            System.out.println("Some exception on writing into a file has been cast.");
        }
//        я бы выдилил это в другой метод
        try {
            Scanner scan = new Scanner(new BufferedInputStream(new FileInputStream(atMentoringFile)));

            while (scan.hasNextLine()) {
                String readFromFile = scan.nextLine();
                System.out.println(readFromFile);
            }


        } catch (FileNotFoundException e) {
            //            хорошее место чтобы пробросить кастомный эксепшен
            System.out.println("Exception on reading from file are met.");
        }
    }
}


