package service;

import entities.Vegetable;
import java.io.*;
import java.util.List;
import java.util.Scanner;
// в целом конечно запись есть, но если уж говорить про рецеп, то пусть он выглядит соответствующе
// например: Для домашненго овощного салата возьмите 100 грам помидоров, 200 грам огруцов и т.д. всё мелко порезатьб смешать, специи и соус по вкусу
public class Recepie {

    private static File atMentoringFile = new File("atMentoring.txt");

    public static void writeRecepie(List<Vegetable> vegs) throws TextNotWrittenException {

        try (BufferedWriter bufferedOutputStream = new BufferedWriter(new FileWriter(atMentoringFile))) {
            bufferedOutputStream.write(String.valueOf(vegs));
            System.out.println("File has been created. Text is written.");

<<<<<<< HEAD
        } catch (IOException ioe) {
            throw new TextNotWrittenException("Some exception on writing into a file has been cast.");
        }
    }

    public static void readRecepie(List<Vegetable> vegs) throws MyFileNotFoundException {

=======
        } catch (IOException i) {
//            хорошее место чтобы пробросить кастомный эксепшен
            System.out.println("Some exception on writing into a file has been cast.");
        }
//        я бы выдилил это в другой метод
>>>>>>> b56f6ac445aa7e31ea057703b321e42c930bbbd6
        try {
            Scanner scan = new Scanner(new BufferedInputStream(new FileInputStream(atMentoringFile)));

            while (scan.hasNextLine()) {
                String readFromFile = scan.nextLine();
                System.out.println("Text " + readFromFile+ " is read out from the file.");
            }

        } catch (FileNotFoundException e) {
<<<<<<< HEAD
            throw new MyFileNotFoundException("Exception on reading from file is met.");
=======
            //            хорошее место чтобы пробросить кастомный эксепшен
            System.out.println("Exception on reading from file are met.");
>>>>>>> b56f6ac445aa7e31ea057703b321e42c930bbbd6
        }
    }
}


