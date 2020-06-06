package factorypattern;

public class CheesePizza extends Pizza{
    /**
     * CheesePizza is a type of pizza made by New York store. 
     * CheesePizza class contains the ingredientfactory so that it can take ingredients from 
     * that factory and prepare the pizza
     * 
     */ 
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    void prepare(){
        System.out.println("Preparing "+name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();

    }
}