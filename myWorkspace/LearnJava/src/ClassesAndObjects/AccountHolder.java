package ClassesAndObjects;

public class AccountHolder {
	
	String firstname;
	String lastname;
	int age;
	float AccountBalance;
	boolean eligibileForCreditCard;
	
	public void testEligibilityForCreditCard() {
		if (age>25 & AccountBalance>=20000) {
			eligibileForCreditCard = true;
		
	}

}


}
