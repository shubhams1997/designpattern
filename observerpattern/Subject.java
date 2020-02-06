package observerpattern;

/** 
Subject Interface that declares the methods that are necessary for a Observable to have
registerObserver(Observer o) -  method is used to register a Observer object 
removeObserver(Observer o) - method is used to remove a Observer object
notifyObservers() - method is used to send push notifications
*/ 

public interface Subject{
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}