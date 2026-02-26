package day4.abstractClasses;

abstract class Animal {
	//Normal or Concrete methods
	//Abstract Methods
	void eat() {
		System.out.println("Animals eat some food!");	
		}


//this method cannot have a body//
//it will be implemented in the class child classes
abstract void run();
//if an  abstaract clss has only abstract methods
}
class Cat extends Animal{
	@Override
	void run() {
		System.out.println("cats run fast");
	}
	
}
class Cheetah extends Animal{
	@Override
	void run() {
		System.out.println("Cheetah runs very fast");
	}
}
class Demo{
	public static void main(String[] args) {
		Cat c = new Cat();
		Cheetah ch= new Cheetah();
		c.eat();
		c.run();
		ch.eat();
		ch.run();
	}
}