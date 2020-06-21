package commandpattern;

public class RemoteControl{
	Icommand[] onCommands;
	Icommand[] offCommands;

	public RemoteControl(){
		this.onCommands = new Icommand[7];
		this.offCommands = new Icommand[7];
		Icommand noCommand = new NoCommand();
		for(int i=0; i<7 ; i++){
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}

	public void setCommand(int slot, Icommand onCommand, Icommand offCommand){
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	public void onButtonWasPressed(int slot){
		onCommands[slot].execute();
	}

	public void offButtonWasPressed(int slot){
		offCommands[slot].execute();
	}

	public String toString(){
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n--------- Remote Control ---------\n");
		for(int i=0; i<onCommands.length; i++){
			stringBuff.append("[slot "+i+"] "+onCommands[i].getClass().getName() + "\t  "+ offCommands[i].getClass().getName()+" \n");
		}
		return stringBuff.toString();
	}
}