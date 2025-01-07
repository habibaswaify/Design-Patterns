
package structural_patterns.decorator;

public class Americano extends Coffee{

    public Americano() {
        super(25);
    }

    @Override
    public void makeCoffee() {
        System.out.println("Making americano");
        super.makeCoffee();
    }
    
    
    
}