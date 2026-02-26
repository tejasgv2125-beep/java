package Day3.encapsulation;

public class Main {
	public static void main(String[] args) {
		Student ob = new Student("Anu",15);
		System.out.println(ob.getname());
		ob.setname("Anup");
		System.out.println(ob.getname());
		
	}

}
