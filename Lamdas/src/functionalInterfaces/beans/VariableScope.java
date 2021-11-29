package functionalInterfaces.beans;

import java.util.function.IntConsumer;

import javax.sound.sampled.FloatControl;

public class VariableScope {

	public static void main(String[] args) {

		int k=10;
		
		//IntConsumer intConsumer =k-> System.out.println(k);
		
		int i=100;
		IntConsumer in = n-> {
	//		i++;
			//System.out.println(i++);
		};
		
		
	}

}
