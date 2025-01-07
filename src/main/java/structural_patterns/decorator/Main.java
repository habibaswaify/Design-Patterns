package structural_patterns.decorator;

public class Main {

    public static void main(String[] args) {
        // Basic espresso coffee
        Espresso espresso = new Espresso();
        espresso.makeCoffee();

        // Adding whipped cream to espresso
        WhippedCreamDecorator espressoWhippedCream = new WhippedCreamDecorator(espresso);
        espressoWhippedCream.makeCoffee();

        // Basic Americano coffee
        Americano americano = new Americano();
        americano.makeCoffee();

        // Adding milk to Americano
        MilkDecorator americanoMilkDecorator = new MilkDecorator(americano);
        americanoMilkDecorator.makeCoffee();

        // Adding sugar to Americano with milk
        SugarDecorator amerianoSugarMilk = new SugarDecorator(americanoMilkDecorator);
        amerianoSugarMilk.makeCoffee();

        // Adding another layer of milk to Americano with milk and sugar
        MilkDecorator americanoDoubleMilkDecorator = new MilkDecorator(amerianoSugarMilk);
        americanoDoubleMilkDecorator.makeCoffee();

        // Adding whipped cream on top of double milk Americano with sugar
        WhippedCreamDecorator americanoDoubleMilkWhippedCreamDecorator = new WhippedCreamDecorator(americanoDoubleMilkDecorator);
        americanoDoubleMilkWhippedCreamDecorator.makeCoffee();
    }
}
