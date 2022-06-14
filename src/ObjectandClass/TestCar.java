package ObjectandClass;

public class TestCar {

	public static void main(String[] args) {
	
		Car audi = new Car ();
		
		audi.setWheel(4);
		audi.setColor("red");
		audi.setModel("R8USA");
		audi.setDoors(2);
		System.out.println("Audi has wheel:"+ audi.getWheel());
		System.out.println("Audi color is : " + audi.getColor());
		System.out.println("Audi model is : "+audi.getModel());
		System.out.println("Audi has door : "+audi.getDoors());
		
		Car BMW= new Car ();
		BMW.setWheel(4);
		BMW.setColor("red");
		BMW.setModel("R8USA");
		BMW.setDoors(2);
		System.out.println("BMW has wheel :"+ BMW.getWheel());
		System.out.println("BMW color is :"+ BMW.getColor());
		System.out.println("BMW model is :"+BMW.getModel());
		System.out.println("BMW has door :"+BMW.getDoors());
		
	}

}
