package day3;
//here it extends the animal class which is the super class
//public class Dog extends Animal{
//	void Barks() {
//		System.out.println("dog barks");
//	}
//	 
//	
//
//}
//hirearchicall inhereitence
public class Dog extends Animal{
	void Barks() {
		System.out.println("dog barks");
	}
	public static void main(String args[]) {
		Dog d = new Dog();
		
		d.Barks();
		d.print();
		}

}