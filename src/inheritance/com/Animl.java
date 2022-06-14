package inheritance.com;

public class Animl {
	
	private int leg;
	private String name;
	private String color;
	private String size;
	private String tell;
	private int brain;
	
	public Animl(int leg, String name, String color, String size, String tell, int brain) {
			this.leg = leg;
		this.name = name;
		this.color = color;
		this.size = size;
		this.tell = tell;
		this.brain = brain;
	}
	
	public void name() {
		System.out.println("animal has --name");
	}
	
	public void eat() {
		System.out.println("Animal eat ---food ");
	}
	public void lrg()
	{
		System.out.println();
	}
	
	public int getLeg() {
		return leg;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public String getSize() {
		return size;
	}

	public String getTell() {
		return tell;
	}

	public int getBrain() {
		return brain;
	}

	public void setLeg(int leg) {
		this.leg = leg;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public void setTell(String tell) {
		this.tell = tell;
	}

	public void setBrain(int brain) {
		this.brain = brain;
	}
	
	

}
