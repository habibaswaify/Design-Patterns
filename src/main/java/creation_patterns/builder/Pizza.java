package creation_patterns.builder;

import java.util.ArrayList;

public class Pizza {
    private final String name;
    private final String crustType;
    private final String size;
    private final ArrayList<String> toppings;
    private final String sauce;
    private final String cheese;

    public Pizza(String name, String crustType, String size, ArrayList<String> toppings, String sauce, String cheese) {
        this.name = name;
        this.crustType = crustType;
        this.size = size;
        this.toppings = toppings;
        this.sauce = sauce;
        this.cheese = cheese;
    }
    private Pizza(CPizzaBuilder builder){
        this.name = builder.name;
        this.crustType = builder.crustType;
        this.size = builder.size;
        this.toppings = builder.toppings;
        this.sauce = builder.sauce;
        this.cheese = builder.cheese;
        
    }
    public static class CPizzaBuilder implements IPizzaBuilder {
    private String name;
    private String crustType;
    private String size;
    private ArrayList<String> toppings;
    private String sauce;
    private String cheese;

    @Override
    public IPizzaBuilder name(String name) {
       this.name = name;
       return this;
    }

    @Override
    public IPizzaBuilder crustType(String crustType) {
        this.crustType = crustType;
        return this;
    }

    @Override
    public IPizzaBuilder size(String size) {
        this.size = size;
        return this;
    }

    @Override
    public IPizzaBuilder toppings(ArrayList<String> toppings) {
        this.toppings = toppings;
        return this;
    }

    @Override
    public IPizzaBuilder sauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    @Override
    public IPizzaBuilder cheese(String cheese) {
        this.cheese = cheese;
        return this;
    }
    
    @Override
    public Pizza build(){
        return new Pizza(this);
    }    

        
    
    
}
  @Override
        public String toString() {
            return "Name: "+this.name+", crust: "+this.crustType+
                    ", size: "+this.size+", sauce: "+this.sauce+", cheese: "+this.cheese+
                    ", toppings:"+this.toppings;
                    }
}
