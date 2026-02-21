package day3;

public class Cat extends Animal{
	void sound() {
	System.out.println("meow");
}
	public static void main(String[] args) {
		Cat c = new Cat();
		c.sound();
		c.print();

		
	}
	}