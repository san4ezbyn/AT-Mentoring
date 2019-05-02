package entities;

public class Potato extends Vegetable {

    private String shape;

    public Potato(String name, int weight, int calories, String shape) {
        super(name, weight, calories);
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getInfo() {
        return "potato is " + super.getInfo();
    }
}
