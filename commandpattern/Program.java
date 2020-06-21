package commandpattern;

public class Program{
	public static void main(String[] args){
		
		RemoteControl remoteControl = new RemoteControl();

		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan = new CeilingFan();
		Stereo stereo = new Stereo();

		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenRoomLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenRoomLightOff = new LightOffCommand(kitchenLight);

		StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
		StereoOffWithCDCommand stereoOff = new StereoOffWithCDCommand(stereo);

		CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenRoomLightOn, kitchenRoomLightOff);
		remoteControl.setCommand(2, stereoOn, stereoOff);
		remoteControl.setCommand(3, ceilingFanOn, ceilingFanOff);

		System.out.println(remoteControl);

		remoteControl.onButtonWasPressed(0);
		remoteControl.offButtonWasPressed(0);
		remoteControl.onButtonWasPressed(1);
		remoteControl.offButtonWasPressed(1);
		remoteControl.onButtonWasPressed(2);
		remoteControl.offButtonWasPressed(2);
		remoteControl.onButtonWasPressed(3);
		remoteControl.offButtonWasPressed(3);
	}
}

