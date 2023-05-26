package smallProject;
import java.util.Scanner;
public class Bank {
	
	String accountname;
	float displayamount, depositAmount, withdrawamount;
	int accountnumber;
	char accounttype;
	double balance;
	
	void Display(String n, int a, char c, double f){
		this.accountname = n;
		this.accountnumber = a;
		this.accounttype= c;
		this.balance = f;
		
		System.out.println("Account holder = " + accountname);
		System.out.println("Account number = " + accountnumber);
		System.out.println("Account type: = " + accounttype);
		System.out.println("Balance Amount =" + balance);
		
	}
	
	void depositAmount() {
		System.out.println("Enter deposit amount");
		float d = new Scanner(System.in).nextFloat();
		this.depositAmount=d;
		balance +=depositAmount;
		System.out.println("Your amount is :"+balance);
		
	}
	void Withdraw(int withdrawamount) {
		if (balance > 100) {
			
			balance -= withdrawamount;
			System.out.println("Your balance is :"+balance);
		}
		else {
			
			System.out.println("You have low balance");
		}
		
		
	}
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.Display("Rabin", 2000, 's', 1234.00);
		bank.depositAmount();
		bank.Withdraw(200);
		
		
	}
	
	
	
	

}
