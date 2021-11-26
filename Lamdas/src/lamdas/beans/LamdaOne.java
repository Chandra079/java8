package lamdas.beans;

@FunctionalInterface
interface Motor{
	public void start();
}
@FunctionalInterface
interface SumofTwo{
	public int add(int a,int b);
}
public class LamdaOne {

	public static void main(String[] args) {
		Motor motot=()->System.out.println("MOtor Has Started");
		motot.start();
		
		SumofTwo siumSumofTwo = (a,b)->(a+b);
			
		System.out.println(siumSumofTwo.add(10, 232));
		
		Runnable runnable =()->{
			for (int i = 0; i < 122; i++) {
				System.out.println("IN Run Method");
			}};
		Thread thread = new Thread(runnable);
		thread.start();
		for (int i = 0; i < 122; i++) {
			System.out.println("IN Main Method");
		}
	}

}
