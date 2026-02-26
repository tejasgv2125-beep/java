package day2.java.problem2;
class Bank{
	static void intrest() {
		System.out.println("Bank provides intrest on deposits");
	}
 static void intrest(double rate) {
		System.out.println("Intrest Rate"+rate+"%");
	}
}

class SBI extends Bank{
	static void intrest(double rate,int years) {
		double principal = 1000;
		double totalIntrest = (principal*rate*years )/100;
		System.out.println("the total intrest in"+years+"is"+totalIntrest);
	}
}
//here we cant directly use the method me we should use the class name. if we are extending then dont need
public class Main extends SBI {//here i am using the extends or using the inheritence concept so we can use that
	public static void main(String[] args) {
		SBI s=new SBI();//we dont need this 
		Bank.intrest();
		intrest(7.5);
		intrest(7.5, 3);
		
		//if we are not using the concept of the inheritence we should create the object or we should use the bank class
		
		
		
	}

}
