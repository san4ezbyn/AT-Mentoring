package salad;

public class SaladMenu extends Ingredients {

    private String typeOfIngredients;

    public SaladMenu(String vegName, int calories, String typeOfIngredients) {
        super(vegName, calories);
        this.typeOfIngredients = typeOfIngredients;
    }

    public String getTypeOfIngredients() {
        return typeOfIngredients;
    }

    public void setTypeOfIngredients(String typeOfIngredients) {
        this.typeOfIngredients = typeOfIngredients;
    }


    public String getInfo() {
        return super.getInfo() + " type " + typeOfIngredients;
    }
}
