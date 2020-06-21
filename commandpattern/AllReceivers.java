package commandpattern;

// ------------ LIGHT ------------------

class Light{
	String name;

	public Light(String name){
		this.name = name;
	}

	public void on(){
		System.out.println(this.name+" Light is On");
	}

	public void off(){
		System.out.println(this.name+" Light is Off");
	}
}

// ------------ STEREO ---------------

class Stereo{
	public void on(){
		System.out.println("Stereo is On");
	}

	public void off(){
		System.out.println("Stereo is Off");
	}

	public void setCD(){
		System.out.println("Setting up Stereo CD");
	}

	public void setVolume(int level){
		System.out.println("Stereo volume is set to "+ level);
	}
}

// ------------ CEILINGFAN ---------------

class CeilingFan{
	public void on(){
		System.out.println("CeilingFan is On");
	}

	public void off(){
		System.out.println("CeilingFan is Off");
	}
}













