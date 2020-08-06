package proxypattern;

import java.rmi.*;
import java.rmi.server.*;

// SKELETON
// This workes like skeleton on the server. it runs all the time and waits for the requests from the client machine


public class GunballMachineTestDrive {
	public static void main(String[] args){
		try{	
			GunballMachineRemote gunballMachine  = new GunballMachine("New Delhi", 200);
			Naming.rebind("gunballmachine", gunballMachine);
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}