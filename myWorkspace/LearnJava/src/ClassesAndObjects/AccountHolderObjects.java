package ClassesAndObjects;

public class AccountHolderObjects {

	public static void main(String[] args) {
		
		AccountHolder tom = new AccountHolder();
		AccountHolder henry = new AccountHolder();
		AccountHolder sarah = new AccountHolder();
		
		tom.firstname = "Tom";
		tom.lastname = "Middleton";
		tom.age = 30;
		tom.AccountBalance = 25000;
		tom.testEligibilityForCreditCard();
		
		henry.firstname = "Henry";
		henry.lastname = "Ford";
		henry.age = 65;
		henry.AccountBalance = 69000;
		henry.testEligibilityForCreditCard();
		
		sarah.firstname = "Sarah";
		sarah.lastname = "McLauren";
		sarah.age = 31;
		sarah.AccountBalance = 18000;
		sarah.testEligibilityForCreditCard();
		
		
		System.out.println("Is TOM eligible for credit card: " +tom.eligibileForCreditCard);
		System.out.println("Is Henry eligible for credit card: " +henry.eligibileForCreditCard);
		System.out.println("Is Sarah eligible for credit card: " +sarah.eligibileForCreditCard);
	
		
	}

}
