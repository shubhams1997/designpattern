package proxypattern;

// CLIENT CODE
// This class is responsible to call the methods of remote class object.

public class GunballMonitor{
	GunballMachineRemote machine;

	public GunballMonitor(GunballMachineRemote machine){
		this.machine = machine;
	}

	public void report(){
		try{
			System.out.println("Count = "+machine.getCount());
			System.out.println("Locatin = " + machine.getLocation());
			System.out.println("State = " + machine.getState());
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}