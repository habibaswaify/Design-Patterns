package structural_patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class HouseCatFactory {
    private static final Map<String,HouseCat> catMap = new HashMap<>();
    public static Cat getCat(String breed){
        HouseCat houseCat = catMap.get(breed);
        if (houseCat == null){
            houseCat = new HouseCat(CatUtils.getRandColor(), breed, CatUtils.getRandName());
            catMap.put(breed, houseCat);
        }
        return houseCat;
    }
    public static int getNumberOfCats(){
        return catMap.size();
    }
}
