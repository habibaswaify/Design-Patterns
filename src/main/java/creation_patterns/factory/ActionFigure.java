package creation_patterns.factory;

public class ActionFigure extends Toy{
    public ActionFigure(String name, double price, String material, Size size) {
        super(name, price, material, size);
    }
    @Override
    public void manufacture() {
        super.manufacture();
        System.out.println("Manufacturing action figure...");
    }
}
