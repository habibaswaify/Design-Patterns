package structural_patterns.decorator;

public class SugarDecorator implements ICoffee{
    private final ICoffee coffee;

    public SugarDecorator(ICoffee coffee) {
        this.coffee = coffee;
    }
    @Override
    public double getPrice() {
        return coffee.getPrice() + 2.5;
    }

    @Override
    public void makeCoffee() {
        System.out.println("Added sugar to coffee, cost: "+getPrice());
    }
    
}