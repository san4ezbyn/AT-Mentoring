package utils;

public class Tomato extends Vegatables {

    private int diameter;

    public Tomato(String name, int weight, int calories, int diameter) {
        super(name, weight, calories);
        this.diameter = diameter;
    }
}
