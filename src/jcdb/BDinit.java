package jcdb;

import entities.Vegetable;

public class BDinit extends Vegetable {

private String type;
    public BDinit(String name, int weight, int calories, String type) {
        super(name, weight, calories);
        this.type=type;
    }

    public BDinit(String name, int weight) {
        super(name, weight);
    }

    public BDinit() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Veg is " + super.getName() + " weight is " + super.getWeight() + " type - " + this.getType();
    }
}
