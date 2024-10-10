package que1;

public interface Driveable {

	default void startEngine() {
		System.out.println("Engine Started");
	}
	public void drive();
	public void shutDown();
}
