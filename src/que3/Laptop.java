package que3;

public class Laptop extends ElectronicDevice{

	@Override
	public boolean turnOff() {
		System.out.println("Laptop is Turn off");
		return false;
	}

}
