package week1.day1;

public class FibonacciSeries {
	
	int range = 8;
	int firstNum = 0;
	int secNum = 1;
	int sum = 0;
	public void fibonacci() {
		System.out.println(firstNum);
		System.out.println(secNum);
		for(int i = 1;i<range-1;i++)
		{			
			sum = firstNum + secNum;	
			System.out.println(sum);
			firstNum = secNum;
			secNum = sum;
			
		}
		
	}
	

	public static void main(String[] args) {
		FibonacciSeries objFibo = new FibonacciSeries();
		System.out.println("Fibonacci Series for " + objFibo.range +" numbers are:" );
		objFibo.fibonacci();

	}

}