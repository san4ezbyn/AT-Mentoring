package salad;

public class HouseSaladFilling1 extends HouseSaladBase {

    public HouseSaladFilling1(Filling filling) {
        super(filling);
    }


    @Override
    public int getHouseDishCals() {
        return super.getHouseDishCals() + 75;
    }

    @Override
    public String getDescription() {
        return " secret filling 1," + super.getDescription();
    }

}
