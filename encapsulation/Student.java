package encapsulation;

public class Student {
	private String name;
	private int age;//here we are using the private keyword so we should use get and set method in this keyword to access 
	//outside the classs of the different class
	
	Student(String n,int a){
		name = n;
		age = a;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}


}
