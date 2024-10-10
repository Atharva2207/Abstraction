package que3;

public abstract class ElectronicDevice implements Device {

	public boolean turnOn() {
		System.out.println("Turn on");
		return true;
	}
}
