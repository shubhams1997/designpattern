package factorypattern;

public class ClamPizza extends Pizza{
    /**
     * Clampizza is a type of pizza made by New York store. 
     * clampizza class contains the ingredientfactory so that it can take ingredients from 
     * that factory and prepare the pizza
     * 
     */ 
    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    void prepare(){
        System.out.println("Preparing "+name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}