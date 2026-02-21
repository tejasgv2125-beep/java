package overLoading;



//method overloading
public class Calculator {
	
	static void calci(int a,int b) {//here method is same so it is method overloading
		System.out.println(a+b);
	}
	static void calci(double a,double b) {//if we use the static keyword we doint need to create the obejct
		System.out.println(a*b);
		
	}//static method can be overloaded
	static  int calci(int a, int b,int c) {
		return (a+b)/c;
		
	}
	public static void main(String[] args) {
		calci(5,5);
		calci(10.9,1.9);
		System.out.println(calci(7,9,13));
	}

}
