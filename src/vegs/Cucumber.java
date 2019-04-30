package vegs;

import utils.Vegatables;

public class Cucumber extends Vegatables {

    private String type;

    public Cucumber(String name, int weight, int calories, String type) {
        super(name, weight, calories);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
