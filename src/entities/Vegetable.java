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
<<<<<<< HEAD

    /*public String getInfo() {
=======
// используй для этого метод toString()
    public String getInfo() {
>>>>>>> b56f6ac445aa7e31ea057703b321e42c930bbbd6
        return this.name + " weights " + this.weight + " and has " + this.calories + " calories. ";
    }*/

    @Override
    public int compareTo(Vegetable o) {
        return this.getWeight() - o.getWeight();
    }

    @Override
    public String toString() {
        return "Name is " + name + " weight is " + weight + " calories - " + calories;
    }
}
