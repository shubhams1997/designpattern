package proxypattern;

import java.rmi.*;

// GunballMachineRemote interface the have methods that can called Remotely
// All return type need to be Primitive or serializable (State should be serializable)
public interface GunballMachineRemote extends Remote{
	public int getCount() throws RemoteException;
	public String getLocation() throws RemoteException;
	public State getState() throws RemoteException;
}
