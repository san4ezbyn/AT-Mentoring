package utils;

import entities.Vegetable;

import java.util.List;

public class ConsolePrinter {

    public static void consolPrt(List<Vegetable>vegetables) {
        for(Vegetable vegs: vegetables){
            System.out.println(vegs.toString());
        }

    }
}
