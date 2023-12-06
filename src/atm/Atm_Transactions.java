package atm;

import java.util.Scanner;

public class Atm_Transactions {
	
	public static void main(String[] args) {
		int balance = 100000, withdraw, deposit;
		
		Scanner sc = new Scanner(System.in);
		String ii = "inserted";
		System.out.println("insert ur card : ");
		String c = sc.nextLine();
			while(ii.equals(c))
			{
				System.out.println("Automated Teller Machine.");
				System.out.println("Choose 1 for Withdraw.");
				System.out.println("Choose 2 for Deposit");
				System.out.println("Choose 3 for Check Balance");
				System.out.println("Choose 4 for Exit");
				System.out.println("Choose the operation you want to perform : ");
				
				int choice = sc.nextInt();//1
				
				switch(choice)
				{
					case 1 :System.out.println("Enter money to be withdrwan.");
					withdraw = sc.nextInt();
					//100000>=50000
					if(balance >= withdraw)
					{
						balance = balance - withdraw;//50000
						System.out.println("Please collect your money : "+withdraw);
					}
					else
					{
						System.out.println("Insufficient Balance.");
					}
					System.out.println();
					break;
					
					
					case 2	:System.out.println("Enter money to be deposited.");
					
					deposit = sc.nextInt();
					
					balance = balance + deposit;
					System.out.println("Your Money has been successfully Deposited.");
					System.out.println();
					break;
					
					
					case 3	:System.out.println("Balance:"+balance);
					System.out.println();
					break;
					
					case 4	:System.exit(0);
				}
			}
			System.out.println("pls insert ur card to do further transactions");
		}
		
	}

