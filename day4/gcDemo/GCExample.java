package day4.gcDemo;

public class GCExample {
	public static void main(String[] args) {
		String  s1=new String("java");
		String s2 =new String("Python");
		s1=s2;
		System.gc();
		//now in the string pool,java is not available
		//that proves that garbage collection is automatic
		System.out.println(s1);
	}

}
