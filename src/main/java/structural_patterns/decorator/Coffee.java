package structural_patterns.decorator;

public abstract class Coffee implements ICoffee{
    private double price;

    public Coffee(double price) {
        this.price = price;
    }
    


    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public double getPrice() {
        return this.price;
    }
    @Override
    public void makeCoffee(){
        
    }
    
    
}
