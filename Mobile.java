//- Create package name as week1.day1 under src/main/java
//- Create a  new class as "Mobile" under week1.day1
//- Create 2 methods (makeCall() , sendMsg()) with simple print statement
//- In first method create variable  mobileModel (String),mobileWeight (float)
//- In second method create variable  isFullCharged (boolean),mobileCost (int)
//Create main method
//Create object for class and call  from main method and print them
//- print a statement---->"This is my mobile";
//run and confirm the output printed in console //

package week1.day1;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Mobile vivo = new Mobile ();
System.out.println("This is my mobile");
vivo.makecall();
vivo.sendmsg();

	}
	public void makecall() {
		String mobileMode1="Samsung";
		Float mobileWeight=100f;
		System.out.println("Mobile name is "+mobileMode1);
		System.out.println("Mobile weight is "+mobileWeight);
	}
	public void sendmsg()
	{
		boolean isFullCharged= true;
		int mobileCost= 10000;
		System.out.println("Mobile charge is "+isFullCharged);
		System.out.println("Mobile Cost is"+mobileCost);
		
	}

}
