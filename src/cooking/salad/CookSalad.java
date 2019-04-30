package cooking.salad;

import salad.*;

import java.io.*;
import java.util.*;

public class CookSalad {

    public static void main(String[] args)  {

        HouseSalad houseSalad = new HouseSalad(new HouseSaladFilling1(new HouseSaladFilling2(new HouseSaladFilling3())));

        System.out.println("Welcome to our Michelin stars' restuarant 'Y Sanu4a'." +
                "\nWe are glad to offer you our best house dish: salad - " + houseSalad.getDescription() + " and only " + houseSalad.getHouseDishCals() + " calories.");
        System.out.println("Bon Appetit!");


        List<SaladMenu> ingredientsList = new ArrayList<>();

        boolean actionSelect = true;
try {
    while (actionSelect) {

        System.out.println("\n1. =add a veg to the list of ingredients");
        System.out.println("2. =find a veg by vegName");
        System.out.println("3. =show the list");
        System.out.println("4. =total calories");
        System.out.println("5. =sort and show the largest N of cals");
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
                System.out.println("Type a veg's name:");
                String vegName = scanner.next();
                System.out.println("Type the N of calories:");
                int calories = scanner.nextInt();
                System.out.println("Select type of veg: Fresh or Prinkled");
                String typeOfIngredients = scanner.next();

                ingredientsList.add(new SaladMenu(vegName, calories, typeOfIngredients));

                break;

            case 2:
                System.out.println("Type a vegName to search");
                String name = scanner.next();
                SearchVeg.findVeg(name, ingredientsList);
                break;

            case 3:
                for (SaladMenu saladType : ingredientsList) {
                    System.out.println(saladType.getInfo());
                }

                break;

            case 4:
                int totalCals;
                for (SaladMenu saladType : ingredientsList) ;

                totalCals = ingredientsList
                        .stream()
                        .mapToInt(Ingredients::getCalories)
                        .sum();

                System.out.println("Salad has " + totalCals + " calories.");

                break;

            case 5:
                int bigCals = 0;
                for (SaladMenu saladType : ingredientsList) {
                    if (bigCals < saladType.getCalories()) {
                        bigCals = saladType.getCalories();
                    }

                }
                System.out.println("The lagest Cals' are " + bigCals);


                /*String sortCals;
                for (SaladMenu saladType : ingredientsList) ;

                ingredientsList.sort(Comparator.comparing(Ingredients::getCalories).thenComparing(Ingredients::getVegName));

                System.out.println("SORT " + ingredientsList.toString());
                ingredientsList
                        .stream()
                        .sorted(Comparator.comparing(Ingredients::getCalories))
                        .forEach(Ingredients::getVegName);

                System.out.println("Salad has " + " calories.");*/
                break;

            case 6:
                try {
                    Recepie.writeRecepie();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;

            default:
                System.out.println("Incorrect value! Please, try again!");
                break;
        }


    }
}
catch (InputMismatchException ime){
    System.out.println("No such element known. Please, enter another one.");
}


    }
}
