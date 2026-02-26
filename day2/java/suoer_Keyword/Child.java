package day2.java.suoer_Keyword;

public class Child extends Parent{
	int x =20;
	void Show() {
		super.print();
		System.out.println(x);
		System.out.println(super.x);
		
	}
	public static void main(String[] args) {
		Child ob = new Child();
		ob.Show();
	}
	

}
