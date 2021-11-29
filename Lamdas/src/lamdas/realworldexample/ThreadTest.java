package lamdas.realworldexample;



public class ThreadTest {

	public ThreadTest(){
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
	
		Runnable run =()-> {
			for(int i=0;i<1000;i++) {
				System.out.println("In Runnn");
			}
		};
		Thread t = new Thread(()-> {
			for(int i=0;i<1000;i++) {
				System.out.println("In Runnn of Lamda");
			}
		});
		t.start();
		
		for(int i=0;i<1000;i++) {
			System.out.println("Main");
		}
		
		
	}

	

}
