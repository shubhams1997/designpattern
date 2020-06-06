package factorypattern;

abstract class PizzaStore{
    /**
     * PizzaStore is a abstract class used to refer the different stores like NewYork Store
     * or Chicago Pizza Store. 
    */ 
    public abstract Pizza createPizza(String name);
    public abstract void orderPizza();
}