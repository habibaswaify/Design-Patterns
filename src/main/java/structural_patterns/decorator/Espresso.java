package structural_patterns.decorator;

public class Espresso extends Coffee{

    public Espresso() {
        super(20);
    }

    @Override
    public void makeCoffee() {
        System.out.println("Making espresso");
        super.makeCoffee();
    }
    
    
    
}
