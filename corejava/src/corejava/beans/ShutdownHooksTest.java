package corejava.beans;

class ShutDownHookLogic extends Thread{
	@Override
	public void run() {
		System.out.println("Executing ShutDown Logic");
	}
}
class ShutDownHookLogicSystemExit extends Thread{
	@Override
	public void run() {
		System.out.println("Testing to see System.exit ");
	}
}
public class ShutdownHooksTest {

	public static void main(String[] args) {
		System.out.println("Started");
		Runtime runtime = Runtime.getRuntime();
		runtime.addShutdownHook(new ShutDownHookLogic());
		System.out.println("Ended");
		System.exit(100);
		runtime.addShutdownHook(new ShutDownHookLogicSystemExit());
	}

}
