package entities;

import java.util.List;

public class Salad {

    private List<Vegetable> mixedVegs;

    public Salad(List<Vegetable> mixedVegs) {
        this.mixedVegs = mixedVegs;
    }

    public List<Vegetable> getMixedVegs() {
        return mixedVegs;
    }

    public void setMixedVegs(List<Vegetable> mixedVegs) {
        this.mixedVegs = mixedVegs;
    }
}
