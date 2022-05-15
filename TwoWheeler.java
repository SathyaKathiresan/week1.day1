package week1.day1;

public class TwoWheeler {
	
	int noOfWheels = 4;
	short noOfmirrors = 6;
	long chasisNumber = 3563212345678901234l;
	boolean isPunctured = false;
	String bikeName = "Pulsor and RE";
	double runningKM = 12.34345;
	
			

	public static void main(String[] args) {
		
		TwoWheeler objWheel = new TwoWheeler();
		System.out.println(objWheel.noOfWheels);
		System.out.println(objWheel.noOfmirrors);
		System.out.println(objWheel.chasisNumber);
		System.out.println(objWheel.isPunctured);
		System.out.println(objWheel.bikeName);
		System.out.println(objWheel.runningKM);
		

	}

}
