package service;

import entities.Vegetable;

import java.util.List;

public interface ISort {

    List<Vegetable> sortedVegsByWeight(List<Vegetable> unsortedVegs);

    List<Vegetable> findByName(List<Vegetable> vegetables, String name);
}
