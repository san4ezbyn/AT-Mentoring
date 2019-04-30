package vegs;

import utils.Vegatables;

public class Potato extends Vegatables {

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
}
