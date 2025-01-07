package structural_patterns.flyweight;

public class Main {

    public static void main(String[] args) {
        // Unique instances are added to the map while repeated instances are returned
        for(int i = 0; i<=100;i++){
            HouseCat houseCat = (HouseCat) HouseCatFactory.getCat(CatUtils.getRandType());
            houseCat.meow();
        }
        System.out.println("Number of cats: "+HouseCatFactory.getNumberOfCats());

    }
}
