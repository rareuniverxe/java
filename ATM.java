package atmMachine;

import java.util.Scanner;

public class ATM {
	float Balance;
	int PIN=5674;
	
	public void checkpin() {
		System.out.println("Enter your pin: ");
		Scanner sc = new Scanner(System.in);
		int enteredPin = sc.nextInt();
		if(enteredPin == PIN) {
			menu();
		}
		else {
			System.out.println("Enter a valid pin");
			checkpin();
		}
	}
	
	public void menu() {
		System.out.println("Enter your choice: ");
		System.out.println("1. Check A/C balance ");
		System.out.println("2. Withdraw Money");
		System.out.println("3. Deposit Money");
		System.out.println("4. Exit");
		
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		
		if(option == 1) {
			checkBalance();
		}
		else if(option == 2) {
			withdrawMoney();
		}
		else if(option == 3) {
			depositMoney();
		}
		else if(option == 4) {
			System.out.println("Exited Successfully");
		}
		else {
			System.out.println("Enter a valid choice");
		}
	}
	
	public void checkBalance() {
		System.out.println("Balance: "+Balance);
		menu();
	}
	
	public void withdrawMoney() {
		System.out.print("Enter amount to withdraw: ");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		if(amount>Balance) {
			System.out.println("Insufficient Balance");
		}
		else {
			Balance = Balance - amount;
			System.out.println("Money withdrawl successful");
		}
		menu();
	}
	
	public void depositMoney() {
		System.out.print("Enter the amount: ");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		Balance = Balance + amount;
		System.out.println("Money deposited successfully");
		menu();
	}
	
	public class ATMMachine {
		public static void main(String[] args) {
			ATM obj = new ATM();
			obj.checkpin();
		}
	}
}
