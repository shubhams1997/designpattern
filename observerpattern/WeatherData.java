package observerpattern;
import java.util.*;

/**
WeatherDate class Implements Subject interface. It acts like a observable, whenever any 
change take place then this class calls the update method in all the objects who are 
registered with this class.

observers - it is a ArrayList of Observer type
registerObserver(Observer o) - method adds the observer o to list
removeObserver(Observer o) - method get the index of observer from the list and remove the observer from the observers list
notifyObservers() - method traverse through all the observers and call the update method
measurementChanged() - method is called to invoke notifyObserers method
setMeasurement(float,float,float) - method change the data of class and invoke the 
	measurementchaged() method , which then invoke notifyObservers() method.
*/ 

public class WeatherData implements Subject{
	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData(){
		observers = new ArrayList<Observer>();
	}

	public void registerObserver(Observer o){
		observers.add(o);
	}

	public void removeObserver(Observer o){
		int i = observers.indexOf(o);
		if(i>=0)
			observers.remove(i);
	}

	public void notifyObservers(){
		for(int i=0; i<observers.size(); i++){
			Observer observer = observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}

	public void measurementsChanged(){
		notifyObservers();
	}

	public void setMeasurement(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}
