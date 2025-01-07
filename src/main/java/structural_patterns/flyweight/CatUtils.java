package structural_patterns.flyweight;

import java.util.Random;

public class CatUtils {
    private static final Random rand = new Random();
    public static String getRandColor(){
        String[] colors = {"White","Black","Beige","Orange","Tuxedo"};
        return  colors[rand.nextInt(colors.length)];
    }
    public static String getRandName(){
        String[] names = {"Snow","Andie","Andrew","Kurt","Millie","Milo","John"};
        return names[rand.nextInt(names.length)];
    }
    public static String getRandType(){
        String[] types = {"Siamese","Persian","Calico","Mixed"};
        return types[rand.nextInt(types.length)];
    }
}
