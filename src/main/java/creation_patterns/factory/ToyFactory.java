package creation_patterns.factory;

public class ToyFactory {
    public Toy createToy(String type, double price, String material, Size size){
        return switch (type) {
            case "Car" -> new Car(type, price, material, size);
            case "Doll" -> new Doll(type, price, material, size);
            case "ActionFigure" -> new ActionFigure(type, price, material, size);
            default -> {
                System.out.println("Invalid toy type");
                throw new IllegalArgumentException();
            }
        };
    }
}
