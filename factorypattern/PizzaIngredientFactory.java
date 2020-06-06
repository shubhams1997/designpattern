package factorypattern;

public interface PizzaIngredientFactory{
    /**
     *  PizzaIngredientFactory interface provides a general ingredient creation process
     * Different Stores (NY store and Chicago store) have different ingredients 
     * so its the job of pizzaingredientfactory class to provide ingredients to there specific stores.
     */ 
    public String createDough();
    public String createSauce();
    public String createCheese();
    public String[] createVeggies();
    
}