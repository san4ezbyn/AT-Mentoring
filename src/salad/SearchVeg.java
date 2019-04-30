package salad;

import java.util.List;
import java.util.stream.Collectors;

public class SearchVeg {

    public static void findVeg(String searchName, List<SaladMenu> ingredientsList) {

            for (SaladMenu item : ingredientsList) {
                if (searchName.matches(item.getVegName())) {

                    System.out.println("Veg " + searchName + " is present in the list. " + item.getInfo());
                }
            }
        
    }
}
