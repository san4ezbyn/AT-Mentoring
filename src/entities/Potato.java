package entities;

public class Potato extends Vegetable {

    private String shape;

    public Potato(String name, int weight, int calories, String shape) {
        super(name, 100, 70);
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }
    public String getInfo() {
        return "potato is "+super.getInfo();
    }
}
