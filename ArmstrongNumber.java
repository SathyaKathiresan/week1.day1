package week1.day1;

public class ArmstrongNumber {
	

	public static void main(String[] args) {
		int input = 153;
		int reference = input;
		int sum = 0;
		
		while(input>0)
		{
			int rem = input%10;
			sum = sum + rem*rem*rem;
			input = input/10;		
		}
		System.out.println(sum);
		if(sum==reference)
			System.out.println(reference + " is a Armstrong Number");
		else
			System.out.println(reference +" is Not a Armstorng Number");

	}

}
