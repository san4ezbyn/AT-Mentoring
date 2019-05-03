package service;

import entities.Vegetable;

import java.util.List;

public class Recepie {


    private static String cucumberName;
    private static int cucumberWeight;
    private static String tomatoName;
    private static int tomatoWeight;
    private static String name = "'Vesenniji'";
    private static int onionWGHT = 50;
    private static String saltOilText = " Chop it, mix, add salt and oil.";

    public static String recepieIngreds(List<Vegetable> vegs) {

        for (Vegetable veg : vegs) {
            if (veg.getName().equalsIgnoreCase("cucumber")) {
                cucumberName = veg.getName();
                cucumberWeight += veg.getWeight();
            }
        }

        for (Vegetable veg : vegs) {
            if (veg.getName().equalsIgnoreCase("tomato")) {
                tomatoName = veg.getName();
                tomatoWeight += veg.getWeight();
            }
        }

        String recepieText = String.format("Salad %s: take %d gr of %s, %d gr of %s, %d gr of green onion. %s", name, tomatoWeight, tomatoName, cucumberWeight, cucumberName, onionWGHT, saltOilText);
       return recepieText;
    }

}
