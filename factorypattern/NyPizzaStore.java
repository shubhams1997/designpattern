package factorypattern;

public class NyPizzaStore extends PizzaStore {
    /**
     * NypizzaStore class Creates New York style pizzas.
     * New York store have different types of pizzas like cheese pizza or clam pizza.
     *  it will create pizza accourding to name of the pizza passed.
     */
 
    public Pizza createPizza(String name){
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NyPizzaIngredientFactory();

        if (name.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }
        else if(name.equals("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }
        pizza.prepare();
        return pizza;
    }
    
    public void orderPizza(){

    }
}