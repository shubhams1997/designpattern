package decoratorpattern;

/** 
All the Beverage Classes, calling getDescription method of Beverage Abstract class.
implementing cost method, which return final value;
*/ 

class HouseBlend extends Beverage{
	public HouseBlend(){
		getDescription("HouseBlend");
	}
	public int cost(){
		return 100;
	}
}

class DarkRoast extends Beverage{
	public DarkRoast(){
		getDescription("DarkRoast");
	}
	public int cost(){
		return 150;
	}
}

class Espresso extends Beverage{
	public Espresso(){
		getDescription("Espresso");
	}
	public int cost(){
		return 200;
	}
}

class Decaf extends Beverage{
	public Decaf(){
		getDescription("Decaf");
	}
	public int cost(){
		return 180;
	}
}