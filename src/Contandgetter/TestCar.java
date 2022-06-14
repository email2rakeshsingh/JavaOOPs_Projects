package Contandgetter;

public class TestCar {

	public static void main(String[] args) {
		
		Car bmw = new Car (4, "Red", 2, 2, false);
		
		System.out.println("weels :"+bmw.getWeel());
		System.out.println("BMW COLOR :"+bmw.getColor());
		System.out.println("BMW DOOR:"+bmw.getDoor());
		System.out.println("BMW HEADLIGHT :"+bmw.getHeadlight());
		
		
		
		
		

	}

}
