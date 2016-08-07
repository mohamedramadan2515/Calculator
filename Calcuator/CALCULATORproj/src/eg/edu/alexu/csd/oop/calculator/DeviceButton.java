package eg.edu.alexu.csd.oop.calculator;

public class DeviceButton {
	private Command com;
	public DeviceButton(Command newcom){
		com=newcom;
	}
	void press(){
		com.excute();
	}
}
