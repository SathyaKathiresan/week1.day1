package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
	
		int input = 13;
		boolean flag = false;
		if(input%2==0 || input%3==0)
		{
			flag = true;
		}
		
		
		if(flag==true)			
			System.out.println(input + " is Not a Prime Number");
		else
			System.out.println(input + " is a Prime Number");

	}

}
