package day4.multipleInheritence;
 interface Browser2 {
	void browser2();

}
interface Browser3{
	void browser3();
}
interface Browser4{
	void browser4(); 
}
class Browsers1 implements Browser2,Browser3,Browser4{
	@Override
	public void browser2() {
		System.out.println("Google chrome");
		
	}
	@Override
	public void browser3() {
		System.out.println("Brave");
	}
	@Override
	public void browser4() {
		System.out.println("Edge");
	}
}
class demo{
	public static void main(String[] args) {
		Browsers1 b=new Browsers1();
		b.browser2();
		b.browser3();
		b.browser4();
	}
}
	
	

