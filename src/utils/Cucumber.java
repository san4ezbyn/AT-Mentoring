package utils;

public class Cucumber extends Vegatables {

    private String type;

    public Cucumber(String name, int weight, int calories, String type) {
        super(name, weight, calories);
        this.type = type;
    }
}
