package cervice;
import entities.*;
import salad.Ingredients;
import salad.SaladMenu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cook {

    public static void main(String[] args) {

        Vegetable cucumber = new Cucumber("Rodnichok", 99, 33, "fresh");
        Vegetable tomato = new Tomato("Veselka", 58, 47, 11);
        Vegetable potato = new Potato("Pospeshka", 133, 88, "oval");

        List<Vegetable> salad = new ArrayList<>();
        int totalCals;

//salad cook
        salad.add(cucumber);
        salad.add(tomato);
        salad.add(potato);

        for (Vegetable veg: salad)
        System.out.println(veg.getInfo());



//calories calculating
        totalCals = salad
                .stream()
                .mapToInt(Vegetable::getCalories)
                .sum();

        System.out.println("Salad has " + totalCals + " calories.");



    }
}


