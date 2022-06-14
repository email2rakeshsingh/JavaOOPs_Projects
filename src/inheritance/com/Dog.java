package inheritance.com;

public class Dog extends Animl {

	private String tail;
	private int eye;
	private int leg;

	public Dog(int leg, String name, String color, String size, String tell, int brain) {
		super(leg, name, color, size, tell, brain);

		this.eye = eye;
		this.tail = tail;
		this.leg = leg;

	}

	@Override
	public void eat() {
		super.eat();
		System.out.println("Dog eat");
	}

	public void brak() {
		System.out.println("Dog has brak");
	}

	public String getTail() {
		return tail;
	}

	public int getEye() {
		return eye;
	}

	public int getLeg() {
		return leg;
	}

	public void setTail(String tail) {
		this.tail = tail;
	}

	public void setEye(int eye) {
		this.eye = eye;
	}

	public void setLeg(int leg) {
		this.leg = leg;
	}

}
