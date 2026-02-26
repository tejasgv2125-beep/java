package day4.Interface;

public interface Animal {
	/*
	 Interface methods are completely abstract &cannot have a body
	 They are implemented in the respective child classes
	 Therforeinterfaces exhibit 100& abstraction
	 */
	void sound();
	void run();
	

}
class Cat implements Animal{
	@Override
	public void sound() {
		System.out.println("Cats Meow");
	}
	public void run() {
		System.out.println("cats runs");
	
	}
}
class Dog implements Animal{
	@Override
	public void sound() {
		System.out.println("Dog barks");
	}
	public void run() {
		System.out.println("Dog runs fast");
	}
}
class demo {
	public static void main(String[] args) {
		Cat c=new Cat();
		Dog d=new Dog();
		c.sound();
		c.run();
		d.sound();
		d.run();
	}


	}
	
