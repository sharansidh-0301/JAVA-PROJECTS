package ATM_MC;

import java.util.Scanner;

public class Mainclass {

	public static void main(String[] args) {
		int UserID = 1234;
		int PIN = 0000;
		ATMOperationsImpl op = new ATMOperationsImpl();
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to The ATM");
		System.out.println("Enter Your UserID : ");
		int userID = in.nextInt();
		System.out.println("Enter Your 4 Digit PIN ");
		int pin= in.nextInt();
		if(userID==UserID && PIN==pin) {
			while(true) {
				
				System.out.println("1. View Balance \n2. Deposit Amount \n3. Withdraw Amount \n4. View Ministatement \n5. Exit ");
				System.out.println("Enter Your Needs....");
				int ch = in.nextInt();
				if(ch==1) {
					op.viewBal();
				}
				
				else if(ch==2) {
					System.out.println("Enter Amount to Deposit : ");
					double depositeAmount = in.nextDouble();
					op.depositAmount(depositeAmount); 
				}
				
				else if(ch==3) {
					System.out.println("Enter Amount to Withdraw : ");
					double withdrawAmount = in.nextDouble();
					op.WithdrawAmount(withdrawAmount);
				}
				
				else if(ch==4) {
					op.viewMiniStatement();
				}
				
				else if(ch==5) {
					System.out.println("Collect Your Card..\n Thank You ...Visit Again...!!!");
					System.exit(0);
				}
				
				else {
					System.out.println("Invalid Input... !!!");
					System.exit(0);
				}
				
				
			}
			
		}
		else {
			System.out.println("Entered UserID or PIN is invalid... !!! ");
			System.exit(0);
		}
		
		
	}

}
