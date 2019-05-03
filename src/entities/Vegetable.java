package entities;

public class Vegetable implements Comparable<Vegetable> {

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

    @Override
    public int compareTo(Vegetable o) {
        return this.getWeight() - o.getWeight();
    }

    @Override
    public String toString() {
        return "Veg is " + name + " weight is " + weight + " calories - " + calories;
    }
}
