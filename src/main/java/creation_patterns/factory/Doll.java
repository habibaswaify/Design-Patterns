package creation_patterns.factory;

public class Doll extends Toy{
    public Doll(String name, double price, String material, Size size) {
        super(name, price, material, size);
    }
    @Override
    public void manufacture() {
        super.manufacture();
        System.out.println("Manufacturing doll...");
    }
}
