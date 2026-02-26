package day4.Strings;

public class StringPool {
	public static void main(String[] args) {
		String s1="java";
		String s2="java";
		System.out.println(s1 == s2);//checks values
		String s3 = new String("Java");
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		
	}

}
/*
 s1 & s2 share same object in the pool
 new String() creates new heap object
 ==compares references
 .equals() compares values
 
 */
