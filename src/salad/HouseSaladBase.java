package salad;

public abstract class HouseSaladBase implements Filling {

    private Filling filling;

    public HouseSaladBase(Filling filling) {
        this.filling = filling;
    }

        @Override
    public int getHouseDishCals() {
        return filling.getHouseDishCals();
    }

    @Override
    public String getDescription() {
        return filling.getDescription();
    }
}
