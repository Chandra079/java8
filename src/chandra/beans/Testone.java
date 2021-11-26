package chandra.beans;

public class Testone {

	public static void main(String[] args) {

			System.out.println("Chandrasheker");
	}

}

@FunctionalInterface
interface InterfaceOne{
	public void m1();
}

@FunctionalInterface
interface InterfaceTwo extends InterfaceOne{
	
}