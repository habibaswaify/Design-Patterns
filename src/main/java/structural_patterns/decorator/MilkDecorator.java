package structural_patterns.decorator;

public class MilkDecorator implements ICoffee{

    
    private final ICoffee coffee;

    public MilkDecorator(ICoffee coffee) {
        this.coffee = coffee;
    }
    @Override
    public double getPrice() {
        return coffee.getPrice() + 5.6;
    }

    @Override
    public void makeCoffee() {
        System.out.println("Added milk to coffee, cost: "+getPrice());
    }
    
}
