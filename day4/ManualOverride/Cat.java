package day4.ManualOverride;

public interface Cat {
	default void sound() {
		System.out.println("meow!");
	}

}
interface dog{
	default void sound(){
		System.out.println("barks");
		
	}
		
	}

class Cog implements Cat,dog{
	public void sound() {
		//System.out.println("Some sound!);
		//Cat.super.sound();
		dog.super.sound();
	}
}
class demo{
	public static void main(String[] args) {
		Cog cog = new Cog();
		cog.sound();
	}
}
