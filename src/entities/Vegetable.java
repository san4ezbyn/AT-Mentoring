package entities;

public class Vegetable {

    private String name;
    private int weight;
    private int calories;

    public Vegetable(String name, int weight, int calories) {
        this.name = name;
        this.weight = weight;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getInfo() {
        return this.name + " weights " + this.weight + " and has " + this.calories + " calories. ";
    }

}
