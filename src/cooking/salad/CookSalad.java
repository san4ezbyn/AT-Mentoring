package cooking.salad;

import entities.*;
import service.Cook;
import service.MyException;
import service.Recepie;
import service.Sorter;
import utils.ConsolePrinter;

import java.io.*;
import java.util.*;

public class CookSalad {

    private static List<Vegetable> vegs = new ArrayList<>();

    static {
        vegs.add(new Potato("Potato", 100, 50, "oval"));
        vegs.add(new Potato("Potato", 120, 60, "oval"));
        vegs.add(new Tomato("Tomato", 80, 40, 12));
        vegs.add(new Tomato("Tomato", 70, 45, 11));
        vegs.add(new Cucumber("Cucumber", 60, 10, "fresh"));
    }

    private static Salad salad;
    private static Cook cook = new Cook();
    private static Sorter sorter = new Sorter();

    public static void main(String[] args) throws MyException {


        boolean actionSelect = true;
        try {
            while (actionSelect) {


                System.out.println("1. =find a veg by vegName");
                System.out.println("2. = my exception");
                System.out.println("3. =cook salad");
                System.out.println("4. =total calories");
                System.out.println("5. =sort and show the ingreds by weight");
                System.out.println("6. = create/write a text into a file");
                System.out.println("0. =exit");

                Scanner scanner = new Scanner(System.in);
                int choice = scanner.nextInt();


                switch (choice) {
                    case 0:
                        actionSelect = false;
                        System.out.println("Completed!");
                        break;

                    case 1:

                        System.out.println("Enter a vegName to search");
                        String name = scanner.next();
                        ConsolePrinter.consolPrt(sorter.findByName(vegs, name));
                        break;

                    case 2:
                        try {
                            throw new MyException(choice);
                        } catch (MyException me) {
                            System.out.println(me.getCaseTwo());
                        }
                        break;

                    case 3:

                        salad = cook.cookSalad(vegs);
                        System.out.println("Salad is ready! \"Bon Appetit!\".");
                        break;

                    case 4:

                        System.out.println("Salad has " + cook.calcCals(salad) + " calories.");

                        break;

                    case 5:
                        ConsolePrinter.consolPrt(sorter.sortedVegsByWeight(vegs));
                        break;

                    case 6:
                        try {
                            Recepie.writeRecepie(vegs);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;
                }
            }
        } catch (InputMismatchException ime) {
            System.out.println("No such element known. Please, enter another one.");
        }
    }
}
