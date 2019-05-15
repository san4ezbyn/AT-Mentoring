package jcdb;

import entities.Vegetable;
// что ещё за сущность? название говорит ни о чём и почему оно наследуется от овоща?
public class mySQL extends Vegetable {

private String type;
    public mySQL(String name, int weight, int calories, String type) {
        super(name, weight, calories);
        this.type=type;
    }

    public mySQL(String name, int weight) {
        super(name, weight);
    }

    public mySQL() {

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
