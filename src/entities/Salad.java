package entities;

import java.util.ArrayList;
import java.util.List;

public class Salad extends Vegetable{


    public Salad(String name, int weight, int calories) {
        super(name, weight, calories);
    }
    List<Salad> vegetables=new ArrayList<>();


}
