package creation_patterns.factory;

public class Car extends Toy{
    public Car(String name, double price, String material, Size size) {
        super(name, price, material, size);
    }

    @Override
    public void manufacture() {
        super.manufacture();
        System.out.println("Manufacturing car...");
    }
}
