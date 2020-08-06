package proxypattern;

import java.rmi.*;

// STUB
// This works like stub on clint machine, this will lookup for gunballmachine object in remote registory
// and the bind it with monitor and monitor then call the methods on the remote machine.

class Program{
	public static void main(String[] args) {
		try{
			GunballMachineRemote machine = (GunballMachineRemote) Naming.lookup("rmi://127.0.0.1/gunballmachine");
			GunballMonitor monitor= new GunballMonitor(machine);
			monitor.report();

		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}