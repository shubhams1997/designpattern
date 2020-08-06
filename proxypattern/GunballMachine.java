package proxypattern;

import java.rmi.*;
import java.rmi.server.*;

// AVAILABLE ON SERVER
// GunballMachine is the RealSubject that executes the methods on server

public class GunballMachine extends UnicastRemoteObject implements GunballMachineRemote{
	String location;
	int GunballNumbers;
	State state;
	public GunballMachine(String location, int GunballNumbers) throws RemoteException{
		this.location = location;
		this.GunballNumbers = GunballNumbers;
		this.state = new GunballState();
	}

	public int getCount(){
		return GunballNumbers;
	}

	public String getLocation(){
		return location;
	}

	public State getState(){
		return this.state;
	}
}