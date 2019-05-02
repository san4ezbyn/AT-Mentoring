package service;

import entities.*;

import java.util.List;

public class Cook implements ICook {

    @Override
    public Salad cookSalad(List<Vegetable> ingreds) {
        return new Salad(ingreds);
    }

    @Override
    public int calcCals(Salad salad) {
        int sum = 0;
        for (Vegetable veg : salad.getMixedVegs()) {
            sum += veg.getCalories();
        }
        return sum;


    }
}


