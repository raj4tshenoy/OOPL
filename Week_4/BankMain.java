import java.util.*;

class Bank{
	Scanner in = new Scanner(System.in);
	String name = new String();
	double num;
	String type = new String();
	double balance;
	static double roi = 0.08;
	Bank(){ //default constructor
		System.out.print("Enter name: ");
		name = in.nextLine();
		System.out.print("Account number: ");
		num = in.nextDouble();
		System.out.print("Account Type: ");
		type = in.next();
		System.out.print("Balance: ");
		balance = in.nextDouble();
	}
	Bank(String name, double num, double balance, String type){ //parameterized constructor
		this.name = name;
		this.num = num;
		this.balance = balance;
		this.type = type;
	}
	void deposit(){
		int amount;
		System.out.print("Enter the amount to be deposited: ");
		amount = in.nextInt();
		balance += amount;
		System.out.println("Amount deposited");
	}
	void withdraw(){
		double amount;
		System.out.print("Enter the amount to be withdrawn: ");
		amount = in.nextInt();
		if(balance-amount<0){
			System.out.print("Cannot withdraw as amount crosses minimum balance");
			return;
		}
		balance -= amount;
		System.out.println("Amount withdrawn.");
	}
	void display(){
		System.out.println("Account Number: "+num);
		System.out.println("Name: "+name);
		System.out.println("Account Type: "+type);
		System.out.println("Account Balance: "+balance+"\n");
	}
	static void displayroi(){
		System.out.println("Rate of interest = "+roi);
	}
}

class BankMain{
	public static void main(String[] args) {
		Bank account = new Bank();
		Bank a = new Bank("Jacob", 1808130000, 15000, "Savings");
		int k;
		account.display();
		a.display();
		Scanner in = new Scanner(System.in);
		do{
			System.out.print("\n\nCHOOSE: \n1. DEPOSIT \n2. WITHDRAW \n3. DISPLAY \n4. DISPLAY RATE OF INTEREST \n:");
			k=in.nextInt();
			switch(k){
				case 1: account.deposit(); break;
				case 2: account.withdraw(); break;
				case 3: account.display(); break;
				case 4: Bank.displayroi(); break;
				default: System.out.println("EXIT");
			}
		}while(k>=1&&k<=4);
	}
}