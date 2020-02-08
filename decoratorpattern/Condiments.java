package decoratorpattern;

/** 
All Condiment classes , they call inherite from CondimentDecorator class and also have a Beverage class object
so we can say that these classes is a Beverage and have a Beverage.

cost() and getDescription() method implementation.
*/ 

class Milk extends CondimentDecorator{
	Beverage beverage;
	public Milk(Beverage beverage){
		this.beverage = beverage;
		getDescription();
	}

	public int cost(){
		return this.beverage.cost() + 20;
	}
	public void getDescription(){
		System.out.println("+ Milk : 20");
	}
}

class Mocha extends CondimentDecorator{
	Beverage beverage;
	public Mocha(Beverage beverage){
		this.beverage = beverage;
		getDescription();
	}
	public int cost(){
		return this.beverage.cost() + 50;
	}
	public void getDescription(){
		System.out.println("+ Mocha : 50");
	}
}

class Soy extends CondimentDecorator{
	Beverage beverage;
	public Soy(Beverage beverage){
		this.beverage = beverage;
		getDescription();
	}
	public int cost(){
		return this.beverage.cost() + 30;
	}
	public void getDescription(){
		System.out.println("+ Soy : 30");
	}
}

class Whip extends CondimentDecorator{
	Beverage beverage;
	public Whip(Beverage beverage){
		this.beverage = beverage;
		getDescription();
	}
	public int cost(){
		return this.beverage.cost() + 40;
	}
	public void getDescription(){
		System.out.println("+ Whip : 40");
	}
}