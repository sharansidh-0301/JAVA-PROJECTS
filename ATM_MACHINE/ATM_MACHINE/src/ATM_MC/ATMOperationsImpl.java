package ATM_MC;


import java.util.LinkedHashMap;
import java.util.Map;

public class ATMOperationsImpl implements ATMOperations{

	ATM atm= new ATM();
	Map<Double,String> ministmt = new LinkedHashMap<>();
	
	@Override
	public void viewBal() {
		System.out.println("Your Available Balance is :"+atm.getBalance());
	}

	@Override
	public void depositAmount(double depositAmount) {
		ministmt.put(depositAmount, " Amount is Deposited ");
		System.out.println(depositAmount+" Deposited Successfully...!!!");
		atm.setBalance(depositAmount+atm.getBalance());
		viewBal();
	}

	@Override
	public void WithdrawAmount(double withdrawAmount) {
		if(withdrawAmount<=atm.getBalance()) {
			
			if(withdrawAmount%500==0) {
				ministmt.put(withdrawAmount, " Amount is Withdrawn ");
				System.out.println("Collect Your Cash "+withdrawAmount);
				atm.setBalance(atm.getBalance()-withdrawAmount);
				viewBal();
					
			}
			else {
				System.out.println("Enter Amount only in multiple of 500");
			}
				
		}
		else {
			System.out.println("Insufficient Balance....!!!");
		}
		
		
	}

	@Override
	public void viewMiniStatement() {
		
		for(Map.Entry<Double,String> m: ministmt.entrySet()) {
			System.out.println(m.getKey()+m.getValue());
		}
		
	}

}
