package salad;

public class HouseSaladFilling2 extends HouseSaladBase {
    public HouseSaladFilling2(Filling filling) {
        super(filling);
    }

    @Override
    public int getHouseDishCals() {
        return super.getHouseDishCals()+120;
    }

    @Override
    public String getDescription() {
        return " secret filling 2, " + super.getDescription();
    }
}
