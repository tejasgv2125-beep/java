package Day3.src.overridding;
////here we are not using the static method so it will nbe over ridden 
class parent{
	void show() {
		System.out.println("Parent Static Method");
	}
}


public class Child extends parent {
	void show() {
		System.out.println("child static method");
	}
	public static void main(String[] args) {
		parent p= new Child();
		p.show();
	}

}

////if we se the static key word the parent will not be overridden by the Child
//class parent{
//	static void show() {
//		System.out.println("Parent Static Method");
//	}
//}
//
//
//public class Child extends parent {
//	static void show() {
//		System.out.println("child static method");
//	}
//	public static void main(String[] args) {
//		parent p= new Child();
//		p.show();
//	}
//
//}
