import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame
{
	public static void main(String args[])
	{
		Random rand = new Random();
		Scanner scanner = new Scanner(System.in);

		int rN = rand.nextInt(100) + 1;
		int count = 0;
		while(true)
		{
			System.out.println("Enter Your Guess(1-100): ");
			int pG = scanner.nextInt();
			count++;

			if(pG == rN)
			{
				System.out.println("Congratulation!! You Won The Match!.");
				System.out.println("You Took " + count + " Round to Win The Match!!!.");
				break;
			}
			else if(rN > pG)
			{
				System.out.println("Nope! The Number is higher. Try Again!!");
			}
			else
			{
				System.out.println("Nope! The Number is lower. Try Again!!");
			}
		}
	}
}