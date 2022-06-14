package inheritance.com;

public class AnimalTest {

	public static void main(String[] args) {

		Dog dog=new Dog(4, "Tom", "black", "Big", "one", 1);
		
		dog.brak();
		dog.eat();
		dog.getBrain();
		System.out.println("*********************");
		Animl an= new Dog(4, "citu", "red", "big", "one", 1);
		
		an.eat();
		an.getBrain();
		an.getColor();
		an.getLeg();
		an.getName();
		an.getSize();
		an.getTell();
	}

}
