package day2.java.suoer_Keyword;

class Parent1{
	Parent1(){
		System.out.println("parent");
	
	}
}
public class Child1 extends Parent1 {
	Child1(){
		super();
		System.out.println("child");
	}

	public static void main(String[] args) {
		Child1 c = new Child1();

	}

}
