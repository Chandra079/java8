package lamdas.beans;



class UnkownException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UnkownException(String str) {
		// TODO Auto-generated constructor stub
		super(str);
		System.out.println("In Exception Class");

	}

}

public class RunnableExample {

	public static void main(String[] args) {
		System.out.println("Started from MAIN");
		RunnableInterface runnable = () -> {
			System.out.println(10/0);
			for (int i = 0; i < 5; i++) {
				System.out.println("In Runnable Method");
			}
		

		};
	
			runnable.runnable();
		

	
	}

}
