import java.util.*;
import java.util.Scanner;


public class ATM1
{
    public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		int choice = 0,password=0;
		long deposit,withdraw,transaction_amount,balance=100000;
		int userId=0;
		int trans=0;
		String transaction_history="";
		
        System.out.println("Enter Your User Id:");
        userId = sc.nextInt();
        System.out.println("Enter your Password:");
        password = sc.nextInt();
        if(userId > 100 && userId < 999 && password > 1000 && password < 9999)
        {
			System.out.println("LOGIN SUCCESSFULLY!!");
            do{
                System.out.println("--------------WELCOME TO ATM MACHINE------------------");
				System.out.println("Choose any one option from given below: ");
                System.out.println("Select 1 - Transaction history");
                System.out.println("Select 2 - Deposit Amount");
                System.out.println("Select 3 - Withdraw amount");
                System.out.println("Select 4 - Transfer");
                System.out.println("Select 5 - Balance Checking");
                System.out.println("Select 6 - Exit");
                choice=sc.nextInt();
				
				
                switch(choice)
                {
                    case 1:
		     
						if(trans == 0)
						{
						System.out.println("Empty");
						}
						else 
						{
							System.out.println("-------------------------------------");
							System.out.println("\n"+ transaction_history);
							System.out.println("\n");
						}
						break;
                    case 2:
						System.out.println("Enter Amount to Deposit:");
						deposit = sc.nextLong();
						balance = balance + deposit;
						trans++;
						System.out.println("Money Deposited successfully");
						String str = deposit + " Money deposited";
						transaction_history=transaction_history.concat(str);
						break;
                    case 3:
						System.out.println("Enter Amount to Withdraw:");
						withdraw=sc.nextLong();
						if(withdraw % 100 == 0 && withdraw < balance)
						{
							balance = balance - withdraw;
							System.out.println("Money withdraw successfully.");
							trans++;
							String str2 = withdraw + " Withdrawn";
							transaction_history = transaction_history.concat(str2);
						}
						else 
						{
							System.out.println("Insufficient Balance.");
						}
						break;
                    case 4:
						System.out.println("Enter Recepient Name:");
						String name = sc.next();
						System.out.println("Enter  Amount to Transfer:");
						transaction_amount = sc.nextLong();
						if(transaction_amount < balance)
						{
							balance = balance - transaction_amount;
							System.out.println("Transferred successfully.");
							trans++;
							String str1 = transaction_amount + " transfered.\n";
							transaction_history = transaction_history.concat(str1);
						}
						else 
							System.out.println("Transfer Unsucessful.");
							break;
                    case 5:
						System.out.println("Your balance is " + balance);
						break;
                }
            }
            while(choice!=6);
         
        }
        else
        {
            System.out.println("Please Enter Correct User ID and Password!!");
        }
		System.out.println("Thank You for Using ATM. Visit Again!!!");
    }
}