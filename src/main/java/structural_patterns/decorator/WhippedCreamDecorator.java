package structural_patterns.decorator;

public class WhippedCreamDecorator implements ICoffee{
    private final ICoffee coffee;

    public WhippedCreamDecorator(ICoffee coffee) {
        this.coffee = coffee;
    }
    
    @Override
    public double getPrice() {
        return coffee.getPrice() + 7.5;
    }
    @Override
    public void makeCoffee() {
        System.out.println("Added whipped cream to coffee, cost: "+getPrice());
    }
    
}