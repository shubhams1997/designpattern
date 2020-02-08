package decoratorpattern;

/**
Beverage Abstract class, this is the main class.
All the Beverages like Espresso, HouseBlend etc extends this class 
and condiment decorator also extends this class.
*/ 

public abstract class Beverage{
	public void getDescription(String description){
		System.out.println("Beverage : "+description);
	}
	public abstract int cost();
}
