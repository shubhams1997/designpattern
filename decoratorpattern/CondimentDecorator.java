package decoratorpattern;

/**
CondimentDecorator is a Abstract class that extends Beverage so
we can say that CondimentDecorator class is a Beverage and also have a Beverage.

All the objects of this class will have a Beverage object.
*/

public abstract class CondimentDecorator extends Beverage{
	
	// we want to have a different getDescription for all the Condiment classes that's why we are
	// having this abstract method getDescription().
	public abstract void getDescription();

}