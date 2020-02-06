package observerpattern;

/** 
CurrentConditionDisplay is a class that is a Observer.
it implements Observer interface so whenever any change take place in Subject then
the update method inside this class will called immediately.

*/ 

public class CurrentConditionDisplay implements Observer, DisplayElement{
	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;
	
	public CurrentConditionDisplay(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

	public void display(){
		System.out.println("Current temperature = "+temperature +"F with "+humidity+" humidity and pressure is "+pressure);
	}
}