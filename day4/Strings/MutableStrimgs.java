package day4.Strings;

public class MutableStrimgs {
	public static void main(String[] args) {
//		String s = "SNPSU";
//		s += "ISE";
//		System.out.println("String:"+s);
		//Buffer is mutable-Thread safe
		StringBuffer buffer = new StringBuffer("SNPSU");
		buffer.append("ISE");
		System.out.println(buffer);
		//Builder is mutable but not safe
		StringBuilder builder = new StringBuilder("SNPSU");
		builder.append("ISE");
		System.out.println(builder);
	}

}
