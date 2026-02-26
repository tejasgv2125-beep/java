package Day2.overridding;
class Animal{
	 void sound(){
		System.out.println("animal makes sound");
	}
}

public class Dog extends Animal {
 void sound(){
		System.out.println("Dog Barks");
	}
	public static void main(String[] args) {
		Animal obj = new Dog();
		obj.sound();
		
	}

}
