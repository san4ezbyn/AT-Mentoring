package cooking.salad;

import entities.*;
import exceptions.CaseTwoNotExistException;
import exceptions.MyFileNotFoundException;
import exceptions.TextNotWrittenException;
import jcdb.ConnectMySQL;
import org.xml.sax.SAXException;
import service.*;
import utils.ConsolePrinter;
import xml.XMLparser;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.*;

public class CookSalad {

    public static List<Vegetable> vegs = new ArrayList<>();

    static {
        vegs.add(new Potato("Potato", 100, 50, "oval"));
        vegs.add(new Potato("Potato", 120, 60, "square"));
        vegs.add(new Tomato("Tomato", 80, 40, 12));
        vegs.add(new Tomato("Tomato", 70, 45, 11));
        vegs.add(new Cucumber("Cucumber", 60, 10, "fresh"));
        vegs.add(new Cucumber("Cucumber", 55, 8, "prinkled"));
    }

    private static Salad salad;
    private static Cook cook = new Cook();
    private static Sorter sorter = new Sorter();

    public static void main(String[] args) throws CaseTwoNotExistException, IOException, ParserConfigurationException, SAXException {


        boolean actionSelect = true;
        try {
            while (actionSelect) {


                System.out.println("1. =find a veg by vegName");
                System.out.println("2. = my exception");
                System.out.println("3. =cook salad");
                System.out.println("4. =total calories");
                System.out.println("5. =sort and show the ingreds by weight");
                System.out.println("6. = write a text into a file");
                System.out.println("7. = read a text from the file");
                System.out.println("8. = read from data base");
                System.out.println("9. = read from XML file");
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
//                    в чём смысл кетча эксепшена который ты и бросил, тем более в том же месте?
                    //перехватил несуществующий инстанс (если ты про логику - то это просто тренировка - создал свой эксепшн
                    case 2:

                        throw new CaseTwoNotExistException(choice);

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
                            RecepieWriteIO.writeRecepie(vegs);
                        } catch (TextNotWrittenException e) {
                            e.printStackTrace();
                        }
                        break;

                    case 7:
                        try {
                            RecepieWriteIO.readRecepie(vegs);
                        } catch (MyFileNotFoundException me) {
                            me.printStackTrace();
                        }
                        break;

                    case 8:
                        ConnectMySQL connectMySQL = new ConnectMySQL();
                        connectMySQL.connectBD();
                        break;

                    case 9:
                        XMLparser xmlRunner = new XMLparser();
                        xmlRunner.runPARSER();
                        break;
                }
            }
        } catch (InputMismatchException ime) {
            System.out.println("No such element known. Please, enter another one.");
        }
    }
}
