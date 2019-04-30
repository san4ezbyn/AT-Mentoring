package salad;

public class Ingredients {

    protected String vegName;
    protected int calories;

    public Ingredients(String vegName, int calories) {
        this.vegName = vegName;
        this.calories = calories;
    }

    public String getVegName() {
        return vegName;
    }

    public void setVegName(String vegName) {
        this.vegName = vegName;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getInfo() {
        return this.vegName + " has " + this.calories + " calories";
    }

}
