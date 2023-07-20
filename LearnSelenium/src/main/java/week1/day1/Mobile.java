package week1.day1;

public class Mobile {

	/*
	 * Assignment 2:

- Create package name as week1.day1 under src/main/java
- Create a  new class as "Mobile" under week1.day1
- Create 2 methods (makeCall() , sendMsg()) with simple print statement
- In first method create variable  mobileModel (String),mobileWeight (float)
- In second method create variable  isFullCharged (boolean),mobileCost (int)
- Create main method
Create object for class and call  from main method and print them
- print a statement---->"This is my mobile";
-run and confirm the output printed in console 
	 */
	// AccessModifier returnType methodName(){}
	// public -->  access every where in your project
	// private --> only inside that particular
	// protected --> only in that package and inherited class
	// default --> only in that package
	
	private void sample() {
		// TODO Auto-generated method stub

	}
	
	private void number() {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 7;
		System.out.println(a+b);
	}
	
	public void makeCall() {
		// TODO Auto-generated method stub
		String mobileModel = "Iphone 14";
		float mobileWgt = 125F;
		System.out.println("mobile model " + mobileModel+"\n "+ "Mobile weight " + mobileWgt);
		
		
	}
	
	public void sendMsg() {
		boolean isFullyCharged = true;
		int mobileCost = 145000;
		System.out.println("Is fully charged  "+ isFullyCharged + "  mobile cost  " + mobileCost);
	}
	
	public static void main(String[] args) {
		int num = 7;
		System.out.println(num);
		
		//ClassName objName = new ClassName();
		Mobile mymob = new Mobile();
		mymob.makeCall();
		mymob.sendMsg();
		
	}
	
}
