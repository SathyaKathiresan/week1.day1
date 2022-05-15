package week1.day1;

public class Mobile {
	
	public void makeCall()
	{
		System.out.println("Making a Call");
	}

	public void sendMsg()
	{
		System.out.println("Sending a Message");
	}
	
	public static void main(String[] args)
	{
		System.out.println("This is a Main Method");
		Mobile objmob = new Mobile();
		objmob.makeCall();
		objmob.sendMsg();
	}
}
