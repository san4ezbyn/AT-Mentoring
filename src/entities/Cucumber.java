package entities;

public class Cucumber extends Vegetable {

    private String type;

    public Cucumber(String name, int weight, int calories, String type) {
        super(name, 80, 30);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getInfo() {
        return "cucumber is "+super.getInfo();
    }
}
