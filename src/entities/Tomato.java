package entities;

public class Tomato extends Vegetable {

    private int diameter;

    public Tomato(String name, int weight, int calories, int diameter) {
        super(name, weight, calories);
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public String getInfo() {
        return "tomato is " + super.toString();
    }
}
