package que2;

public class RobotWork extends Work {

	@Override
	public void work() {
		System.out.println("Robot is Working");		
	}

	@Override
	public void recharge() {
		System.out.println("Robot is Charging");
		
	}

	@Override
	public void dailyRoutine() {
		System.out.println("Robotworker daily routine");
		
		work();
		recharge();
	}

}
