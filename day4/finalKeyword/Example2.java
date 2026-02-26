package day4.finalKeyword;

public class Example2 {
	//if we don't initialize a final variable,where is it initalized?= ans:-in the constrctor
	
	final int x;
	//if we dont initialize a static final variable where it is initialized?= ans:-it is written in the static block
	static final int y;
	Example2(){
		x=200;
	}
	public static void main(String[] args) {
		new Example2();//objects are cumpolsary for the IIB block
		
	}
	static {
		y=10;
		System.out.println("start");
		System.out.println("DB-start");
		System.out.println("JavaScript");
	}
	{
		System.out.println("IIB-1");//when we see two curly brackets its a IIB block
	}

}
