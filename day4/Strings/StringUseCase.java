package day4.Strings;

public class StringUseCase {

	public static void main(String[] args) {
		String message = "Order Confirmed";
		message = message+"-ID:101";
		System.out.println(message);
	}

}
//Why strings are immutable

/*
String is immutabe
stored in scp string contsant pool
every modification creates a new object->heap memory
good for need-only data
*/