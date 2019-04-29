package salad;

public class HouseSalad extends HouseSaladBase {


    public HouseSalad(Filling filling) {
        super(filling);
    }

    @Override
    public int getHouseDishCals() {
        return super.getHouseDishCals()+10;
    }

    @Override
    public String getDescription() {
        return " GLAZ DRAKONA with" + super.getDescription();
    }
}
