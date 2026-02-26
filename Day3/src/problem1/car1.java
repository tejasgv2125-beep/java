package Day3.src.problem1;
class Vehicle1 {

	   
    static void speed() {
        System.out.println("Vehicle is moving at a normal speed.");
    }

  static void speed(int maxSpeed) {
        System.out.println("Maximum speed of vehicle: " + maxSpeed + " km/h");
    }
}
public class car1 extends Vehicle1{
	static void speed(String mode) {
		System.out.println("Car is running in"+mode+"mode");
		
		
	}
	public static void main(String[] args) {
		speed();
		speed(180);
		speed("sport");
	}

}
