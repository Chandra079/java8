package constructor.reference;

public class PolicyType {

	public static void main(String[] args) {
		PolicyInterface policyInterface = PolicyType::new;
		
		System.out.println(policyInterface.getPolicyType().toString());
	}

}
