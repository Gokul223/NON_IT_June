package week1.day1;

public class LearnJavaBasics {
	
	public String addNum() {
		int num = 7;
		boolean isCharge = true;
		char intial = 's';
		String name = "Gokul";
		return name; 
	}

	public static void main(String[] args) {// type main and do 
		// Ctrl + spacebar --> enter
		LearnJavaBasics obj = new LearnJavaBasics();
		int a = 5;
		int b = 7;
		System.out.println(a+b);
		System.out.println(obj.addNum()+7);
	}
}
