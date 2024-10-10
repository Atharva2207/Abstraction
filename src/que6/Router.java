package que6;

public class Router extends NetworkDevice {

	@Override
	public void connect() {
		System.out.println("Router is connected...");
	}

	@Override
	public void disconnect() {
		System.out.println("Router is disconnected...");
	}
	
}
