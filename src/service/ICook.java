package service;

import entities.Salad;
import entities.Vegetable;

import java.util.List;

public interface ICook {

    Salad cookSalad(List<Vegetable> ingreds);

    int calcCals(Salad salad);


}
