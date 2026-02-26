package day4.Interface;
import java.io.*;
public interface InterfaceConcepts {
	void display();

}
class A{
	
}
class B{
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		//Old java Code-Boring Code
		InterfaceConcepts obj=new InterfaceConcepts() {
			public void display() {
				System.out.println("Hello");
			}
			
		};
		//java 8 or 1.8:Lambda Expressions(scala)
		InterfaceConcepts obj1= () -> System.out.println("Hello world");
	}
}
