package factorypattern;

public class NyPizzaIngredientFactory implements PizzaIngredientFactory{
    /**
     * NypizzaIngredientFactory class provides specific to New York pizza store only.
     * job of this class is to provide all necessary ingredients to store.
     */ 
    public String createDough(){
        return "Dough Created";
    }

    public String createSauce(){
        return "Sauce Created";
    }

    public String createCheese(){
        return "Cheese created";
    }

    public String[] createVeggies(){
        String[] veggies = {"Garlic", "Onion", "Mushroom"};
        return veggies;
    }

}