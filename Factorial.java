package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		int range = 5;
		int sum = 1;
		for (int i=1;i<=range;i++)
		{
			sum = sum*i;
		}
		System.out.println("Factorial of " + range + " is " + sum);

	}

}
