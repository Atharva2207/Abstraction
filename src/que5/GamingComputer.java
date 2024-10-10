package que5;

public class GamingComputer extends Computer {

	@Override
	public void upgrade() {
		System.out.println("Upgrading Gaming Computer.... ");		
	}

	@Override
	public void runDiagnostics() {
		System.out.println("System needs to run diagnostics");
		
	}

}
