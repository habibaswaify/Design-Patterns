package structural_patterns.flyweight;

public class HouseCat implements Cat{
    private final String color;
    private final String breed;
    private final String name;

    public HouseCat(String color, String breed, String name) {
        this.color = color;
        this.breed = breed;
        this.name = name;
    }

    @Override
    public void meow() {
        System.out.println("The "+breed+ " cat says: MEOW!");
    }

    public String getColor() {
        return color;
    }

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }
}
