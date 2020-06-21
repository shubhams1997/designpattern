package commandpattern;

// --------- NOCOMMAND --------------------------

class NoCommand implements Icommand{
	public void execute(){ }
}

// --------- LIGHT ON / OFF COMMANDS -------------
class LightOnCommand implements Icommand{
	Light light;
	public LightOnCommand(Light light){
		this.light = light;
	}

	public void execute(){
		light.on();
	}
}

class LightOffCommand implements Icommand{
	Light light;
	public LightOffCommand(Light light){
		this.light = light;
	}

	public void execute(){
		light.off();
	}
}



// --------- STEREO ON / OFF COMMANDS -------------

class StereoOnWithCDCommand implements Icommand{
	Stereo stereo;
	public StereoOnWithCDCommand(Stereo stereo){
		this.stereo = stereo;
	}

	public void execute(){
		stereo.on();
		stereo.setCD();
		stereo.setVolume(11);
	}
}

class StereoOffWithCDCommand implements Icommand{
	Stereo stereo;
	public StereoOffWithCDCommand(Stereo stereo){
		this.stereo = stereo;
	}

	public void execute(){
		stereo.off();
	}
}

// --------- CEILING FAN ON / OFF COMMANDS -------------

class CeilingFanOnCommand implements Icommand{
	CeilingFan ceilingfan;
	public CeilingFanOnCommand(CeilingFan ceilingfan){
		this.ceilingfan = ceilingfan;
	}

	public void execute(){
		ceilingfan.on();
	}
}

class CeilingFanOffCommand implements Icommand{
	CeilingFan ceilingfan;
	public CeilingFanOffCommand(CeilingFan ceilingfan){
		this.ceilingfan = ceilingfan;
	}

	public void execute(){
		ceilingfan.off();
	}
}














