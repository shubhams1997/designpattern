package factorypattern;

public class Program {
    public static void main(String[] args){
        // Create a new NewYork Store to purchase a pizza
        NyPizzaStore nystore = new NyPizzaStore();

        // created a cheese pizza
        Pizza pizza = nystore.createPizza("cheese");
        System.out.println(pizza);

        // created a clam pizza fron NewYork store
        pizza = nystore.createPizza("clam");
        System.out.println(pizza);

    }
}