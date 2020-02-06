package observerpattern;

/**
Observer interface is implemented by the observers classese
update() - update method is called by the Subject whenever any data is changed in the
this method is called implicitly whenever any change is occured in the Obervable object
*/ 

public interface Observer{
	public void update(float temp, float humidity, float pressure);
}
