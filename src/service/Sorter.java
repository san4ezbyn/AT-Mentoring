package service;

import entities.Vegetable;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sorter implements ISort {
    @Override
    public List<Vegetable> sortedVegsByWeight(List<Vegetable> ingredients) {
        Collections.sort(ingredients);
        return ingredients;
    }

    @Override
    public List<Vegetable> findByName(List<Vegetable> vegetables, String name) {
        return vegetables.stream().filter(item -> item.getName().contains(name)).collect(Collectors.toList());
    }
}
